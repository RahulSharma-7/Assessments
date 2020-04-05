package com.example.hibernatesession3;

import com.example.hibernatesession3.entities.Address;
import com.example.hibernatesession3.entities.Author;
import com.example.hibernatesession3.entities.Book;
import com.example.hibernatesession3.entities.Subjects;
import com.example.hibernatesession3.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    AuthorRepository authorRepository;

    @Test
    void contextLoads() {
    }

//    @Test
//    // for one to many
//    void testCreateAuthor() {
//        Author author = new Author();
//        author.setAuthorName("Rahul Sharma");
//        Address address = new Address();
//        address.setStreetNumber(12);
//        address.setLocation("SEC 144");
//        address.setState("DELHI");
//        author.setAuthorAddress(address);
//        Subjects subjects = new Subjects();
//        subjects.setSubjectOne("Subject1");
//        subjects.setSubjectTwo("Subject2");
//        subjects.setSubjectThree("Subject3");
//        subjects.setAuthor(author);
//        author.setSubjects(subjects);
//
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(new Book("Man OR MAchine", author));
//        bookList.add(new Book("Own the World", author));
//        author.setBookList(bookList);
//        authorRepository.save(author);
//
//        Author author1 = new Author();
//        author1.setAuthorName("Rahul Sharma");
//        Address address1 = new Address();
//        address1.setStreetNumber(07);
//        address1.setLocation("SEC 148");
//        address1.setState("NOida");
//        author1.setAuthorAddress(address1);
//        Subjects subjects1 = new Subjects();
//        subjects1.setSubjectOne("Maths");
//        subjects1.setSubjectTwo("Physics");
//        subjects1.setSubjectThree("Astronomy");
//        subjects1.setAuthor(author1);
//        author1.setSubjects(subjects1);
//        List<Book> books = new ArrayList<Book>();
//
//        books.add(new Book("Mastery", author1));
//        books.add(new Book("art of doing", author1));
//        author1.setBookList(books);
//
//
//        authorRepository.save(author1);
//
//    }


    @Test
        // for one to many
    void testCreateAuthor() {
        Author author = new Author();
        author.setAuthorName("Rahul Sharma");
        Address address = new Address();
        address.setStreetNumber(12);
        address.setLocation("SEC 144");
        address.setState("DELHI");
        author.setAuthorAddress(address);
        Subjects subjects = new Subjects();
        subjects.setSubjectOne("Subject1");
        subjects.setSubjectTwo("Subject2");
        subjects.setSubjectThree("Subject3");
        subjects.setAuthor(author);
        author.setSubjects(subjects);

        Author author1 = new Author();
        author1.setAuthorName("Rahul Sharma");
        Address address1 = new Address();
        address1.setStreetNumber(07);
        address1.setLocation("SEC 148");
        address1.setState("NOida");
        author1.setAuthorAddress(address1);
        Subjects subjects1 = new Subjects();
        subjects1.setSubjectOne("Maths");
        subjects1.setSubjectTwo("Physics");
        subjects1.setSubjectThree("Astronomy");
        subjects1.setAuthor(author1);
        author1.setSubjects(subjects1);


        List<Book> bookList = new ArrayList<>();

        List<Author> authorList = new ArrayList<>();


        authorList.add(author);
        authorList.add(author1);

        Book book1 = new Book();
        book1.setBookName("Man Or Machine");
        book1.setAuthors(authorList);

        Book book2 = new Book();
        book2.setBookName("Own the World");
        book2.setAuthors(authorList);

        bookList.add(book1);
        bookList.add(book2);

        author.setBooks(bookList);
        author1.setBooks(bookList);


        Author author2 = new Author();
        author2.setAuthorName("Sharma");
        Address address2 = new Address();
        address2.setStreetNumber(8);
        address2.setLocation("SEC 144");
        address2.setState("G. NOida");
        author2.setAuthorAddress(address2);
        Subjects subjects2 = new Subjects();
        subjects2.setSubjectOne("Maths");
        subjects2.setSubjectTwo("Physics");
        subjects2.setSubjectThree("Astronomy");
        subjects2.setAuthor(author2);
        author2.setSubjects(subjects2);


        List<Book> books = new ArrayList<Book>();
        List<Author> authors = new ArrayList<>();


        authors.add(author2);
        authors.add(author);

        Book book3 = new Book();
        book3.setBookName("Mastery");
        book3.setAuthors(authors);
        Book book4 = new Book();
        book4.setBookName("art of doing");
        book4.setAuthors(authors);



        books.add(book3);
        books.add(book4);
        author2.setBooks(books);
        author.setBooks(books);
        
        authorRepository.save(author);
        authorRepository.save(author1);
        authorRepository.save(author2);

    }

}
