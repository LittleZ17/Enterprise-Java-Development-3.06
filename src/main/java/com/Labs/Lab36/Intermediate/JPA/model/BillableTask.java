package com.Labs.Lab36.Intermediate.JPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task{
    private Integer hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, Date dueDate, boolean status, int hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public Integer getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
