package com.example.joinedstrategyinheritance.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="bankcheck")
@PrimaryKeyJoinColumn(name="id")
public class Check extends Payment{
    public Check(Integer id, double amount, String checknumber) {
        super(id, amount);
        this.checknumber = checknumber;
    }

    public Check() {
    }

    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
