package com.app.booking.hotel.decoratorDesignPattern;

import com.app.booking.hotel.decoratorDesignPattern.Addons.Milk;
import com.app.booking.hotel.decoratorDesignPattern.Addons.Whip;

public class Client {

    public static void main(String[] args){
        Beverage b = new Whip(new Milk(new DarkRoast()));
        System.out.println(b.getCost());
    }

}
