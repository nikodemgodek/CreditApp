package com.example.creditapplication.customer;

import javax.persistence.*;

@Table(name = "customer")
@Entity(name = "customer")
public class Customer {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pesel")
    private String pesel;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Integer id, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
