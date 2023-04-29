package com.Labs.Lab36.Intermediate.JPA.model;

import jakarta.persistence.*;

@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private Name name;
    private String title;
    private String company;

    public Contacts() {
    }

    public Contacts(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }
}
