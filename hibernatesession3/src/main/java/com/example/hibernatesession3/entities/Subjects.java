package com.example.hibernatesession3.entities;

import javax.persistence.*;

@Entity
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectId;

    private String subjectOne;
    private String subjectTwo;
    private String subjectThree;

    @OneToOne(cascade = CascadeType.ALL)
    private Author author;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectOne() {
        return subjectOne;
    }

    public void setSubjectOne(String subjectOne) {
        this.subjectOne = subjectOne;
    }

    public String getSubjectTwo() {
        return subjectTwo;
    }

    public void setSubjectTwo(String subjectTwo) {
        this.subjectTwo = subjectTwo;
    }

    public String getSubjectThree() {
        return subjectThree;
    }

    public void setSubjectThree(String subjectThree) {
        this.subjectThree = subjectThree;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
