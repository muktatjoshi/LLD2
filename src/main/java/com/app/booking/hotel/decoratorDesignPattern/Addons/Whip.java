package com.app.booking.hotel.decoratorDesignPattern.Addons;

import com.app.booking.hotel.decoratorDesignPattern.Beverage;

public class Whip implements Beverage {
    Beverage b;

    public Whip(Beverage b){
        this.b =b;
    }
    @Override
    public int getCost() {
        System.out.println("whip");
        return 5+b.getCost();
    }
}
