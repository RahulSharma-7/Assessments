package com.example.hibernatesession3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;


                //MantToOne example

    //    @ManyToOne
//    private Author author;
//
//    public Book( String bookName, Author author) {
//        this.bookName = bookName;
//        this.author = author;
//    }


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "books")
    private List<Author> authors;

    public void setAuthors(List<Author> authors) {
    if(this.authors==null)
        this.authors = authors;
    else {
        for (Author author:authors) {
            this.authors.add((author));

        }
    }
    }


    public List<Author> getAuthors() {
        return authors;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
}
