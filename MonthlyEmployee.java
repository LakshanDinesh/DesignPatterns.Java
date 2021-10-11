package com.company.factory;

public class MonthlyEmployee extends Employee {

    double rate;

    public MonthlyEmployee (String id, String name, double rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    @Override
    public double calcSalary() {
        return this.rate;
    }
}
