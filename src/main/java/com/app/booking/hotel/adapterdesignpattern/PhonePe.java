package com.app.booking.hotel.adapterdesignpattern;

public class PhonePe implements BankAPI{

    BankAPI bankAPI;

    PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
    }

    @Override
    public double checkBalance() {
        return bankAPI.checkBalance();
    }

    @Override
    public void pay(String from, String to, double amount) {
        bankAPI.pay(from,to,amount);
    }
}
