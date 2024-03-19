package com.app.booking.hotel.prototype;

public class Client {

    static{
        System.out.println("fill registry");
        IntelliStudent sApr = new IntelliStudent();
        IntelliStudent sMay = new IntelliStudent();

        sApr.setId(10);
        sApr.setName("amol");
        sApr.setBatch("APRIL");
        StudentRegistry.register("April22",sApr);
        sMay.setId(20);
        sMay.setName("Datar");
        sMay.setBatch("MAY");
        StudentRegistry.register("May22",sMay);
    }
    public static  void main(String[] args){
        //fillRegistry();
        Student std = StudentRegistry.get("April22");
    }
}
