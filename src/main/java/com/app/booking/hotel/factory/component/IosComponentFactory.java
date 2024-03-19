package com.app.booking.hotel.factory.component;

public class IosComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        System.out.println("ios button created");
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        System.out.println("ios dropdown created");
        return new IosDropDown();
    }

    @Override
    public Menu createMenu() {
        System.out.println("ios menu created");
        return new IosMenu();
    }
}
