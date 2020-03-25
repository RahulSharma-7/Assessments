package com.example.joinedstrategyinheritance.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="card")
@PrimaryKeyJoinColumn(name="id")
public class CreditCard extends Payment{
    private String cardnumber;

    public String getCreditcard() {
        return cardnumber;
    }

    public void setCreditcard(String creditcard) {
        this.cardnumber = creditcard;
    }
}
