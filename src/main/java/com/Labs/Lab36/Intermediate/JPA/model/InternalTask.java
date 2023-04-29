package com.Labs.Lab36.Intermediate.JPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task{

    public InternalTask() {
    }

    public InternalTask(String title, Date dueDate, boolean status) {
        super(title, dueDate, status);
    }
}
