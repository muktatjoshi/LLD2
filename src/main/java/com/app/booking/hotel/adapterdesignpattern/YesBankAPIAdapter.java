package com.app.booking.hotel.adapterdesignpattern;

public class YesBankAPIAdapter implements BankAPI{

    YesBankAPI y = new YesBankAPI();
    @Override
    public double checkBalance() {
        System.out.println(" adapter balance check ");
        return y.getBalance();
    }

    @Override
    public void pay(String from, String to, double amount) {
        System.out.println(" adapter transfer money");
        y.transferMoney(from,to,amount);
    }
}
