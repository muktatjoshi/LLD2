package com.app.booking.hotel.decoratorDesignPattern;

public class DarkRoast implements Beverage{
    @Override
    public int getCost() {
        System.out.println("roast");
        return 25;
    }
}
