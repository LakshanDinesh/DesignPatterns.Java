package com.company.decorator;

public class ThandooriChicken extends PizzaDecorator {


    ThandooriChicken(Pizza p) {
        this.pizza = p;
    }

    public double getCost() {
        return pizza.getCost() + 400;
    }
}
