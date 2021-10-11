
package com.company.factory;

public class ContractBasis extends Employee{

    double rate;

    public ContractBasis(String id, String name, double rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    @Override
    public double calcSalary() {
        return rate - (rate * 0.05);
    }
}
