package com.app.booking.hotel.factory.component;

public class AndroidComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        System.out.println("android button created");
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        System.out.println("android dropdown created");
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        System.out.println("android menu created");
        return new AndroidMenu();
    }
}
