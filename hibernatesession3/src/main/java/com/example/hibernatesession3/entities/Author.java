package com.example.hibernatesession3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;
    private String authorName;
    @Embedded
    private Address authorAddress;

    @OneToOne( cascade = CascadeType.ALL)
    private Subjects subjects;




                                //OneToOne mapping btwn author and book

    //    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
//    private Book book;





                                // OneToMany mapping between author and book

//    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
//    private List<Book> bookList;
//
//    public List<Book> getBookList() {
//        return bookList;
//    }

//    public void setBookList(List<Book> bookList) {
//        this.bookList = bookList;
//    }







    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "author_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        if(this.books==null)
        this.books = books;
        else
        {
            for (Book book:books)
            {
                this.books.add(book);
            }
        }
    }

    public Integer getAuthorId() {
        return authorId;
    }


    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Address getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(Address authorAddress) {
        this.authorAddress = authorAddress;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }
//
//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }
}
