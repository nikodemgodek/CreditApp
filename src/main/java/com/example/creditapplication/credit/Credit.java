package com.example.creditapplication.credit;

import javax.persistence.*;

@Table(name = "credits")
@Entity(name = "credits")
public class Credit {
    //creditid, creditname, customerid, value

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer creditId;

    private String creditName;

    private Integer customerId;

    private double value;

    public Credit() {
    }

    public Credit(Integer creditId, String creditName, Integer customerId, double value) {
        this.creditId = creditId;
        this.creditName = creditName;
        this.customerId = customerId;
        this.value = value;
    }

    public Integer getCreditId() {
        return creditId;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
