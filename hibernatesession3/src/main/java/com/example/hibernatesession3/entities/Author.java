package com.example.hibernatesession3;

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

    @OneToMany
    private List<Subject> subjects;

}
