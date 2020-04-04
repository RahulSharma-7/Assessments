package com.example.hibernatesession3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Integer bookId;
    private String bookName;
}
