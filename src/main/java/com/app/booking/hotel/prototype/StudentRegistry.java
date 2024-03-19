package com.app.booking.hotel.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private static Map<String,Student> reg = new HashMap<>();

    static void register(String s, Student st){
        System.out.println("register students clone");
        reg.put(s,st);
    }

    static Student get(String s){
        System.out.println("get Student for batch: "+s);
        return reg.get(s).clone();
    }
}
