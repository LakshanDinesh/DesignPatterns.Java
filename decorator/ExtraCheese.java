package com.company.decorator;

public class ExtraCheese extends PizzaDecorator {


    ExtraCheese(Pizza p) {
        this.pizza = p;
    }

    public double getCost() {
        return pizza.getCost() + 200;
    }
}
