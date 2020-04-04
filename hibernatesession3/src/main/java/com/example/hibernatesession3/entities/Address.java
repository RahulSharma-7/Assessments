package com.example.hibernatesession3;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private Integer streetNumber;
    private String location;
    private String State;
}
