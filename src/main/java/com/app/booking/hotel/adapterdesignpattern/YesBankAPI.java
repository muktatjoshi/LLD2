package com.app.booking.hotel.adapterdesignpattern;

public class YesBankAPI {
    double getBalance(){
        System.out.println(" yes bank api balance ");
        return 1000.25;
    }

    void transferMoney(String from, String to, double amount){
        System.out.println("yes bank api amount transferred");
    }
}
