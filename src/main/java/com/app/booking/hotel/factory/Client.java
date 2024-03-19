package com.app.booking.hotel.factory;

import com.app.booking.hotel.factory.component.Button;
import com.app.booking.hotel.factory.component.UIComponentFactory;

public class Client {
    public static void main(String[] args){

        Platform p = new Platform();
        UIComponentFactory factory = p.createUIComponentFactory("Android");
        Button b = factory.createButton();
        b.getSize();
    }
}
