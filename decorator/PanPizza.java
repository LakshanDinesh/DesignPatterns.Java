package com.company.decorator;

public class PanPizza extends Pizza {

    PanPizza() {
        this.description = "Pan Pizza";
    }

    @Override
    public double getCost(){
        return 1000;
    }

}
