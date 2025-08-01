package org.example.Juros.entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate date;
    private double amount;

    public Installment() {}

    public Installment(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
