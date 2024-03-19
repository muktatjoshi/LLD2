package com.app.booking.hotel.adapterdesignpattern;

public class Client {

    public static void main(String[] args){
        BankAPI bankAPI = new YesBankAPIAdapter();
        PhonePe pe = new PhonePe(bankAPI);

        System.out.println(" balance "+pe.checkBalance());
    }
}
