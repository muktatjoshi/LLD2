package com.app.booking.hotel;

public class ConcurrencyCheck implements Runnable{
    int num;
    public ConcurrencyCheck(int num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("this thread " + Thread.currentThread().getName());
       // System.out.println(num);
    }
}
