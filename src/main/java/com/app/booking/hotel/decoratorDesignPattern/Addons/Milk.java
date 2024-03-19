package com.app.booking.hotel.decoratorDesignPattern.Addons;

import com.app.booking.hotel.decoratorDesignPattern.Beverage;

public class Milk implements Beverage {

    Beverage b;

    public Milk(Beverage b) {
        this.b = b;
    }

    @Override
    public int getCost() {
        System.out.println("milk");
        return 10 + b.getCost();
    }
}
