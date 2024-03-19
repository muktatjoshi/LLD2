package com.app.booking.hotel;

import java.io.Serializable;

public class Singleton implements Serializable {
    public static Singleton s = new Singleton();

    private Singleton(){

    }

    public Singleton getInstance(){
        return s;
    }

    private void writeObject(java.io.ObjectOutputStream op){

    }

}
////////////////