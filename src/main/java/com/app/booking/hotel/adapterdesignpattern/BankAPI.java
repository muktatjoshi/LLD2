package com.app.booking.hotel.adapterdesignpattern;

public interface BankAPI {
    public double checkBalance();
    public void pay(String from,String to,double amount);
}
