package com.herbalife.calculatordbconsumer.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="calculator")
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    private String operation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Calculator(int number, String operation) {
        this.number = number;
        this.operation = operation;
    }

    public Calculator() {
    }

    public Calculator(int id, int number, String operation) {
        this.id = id;
        this.number = number;
        this.operation = operation;
    }
}

