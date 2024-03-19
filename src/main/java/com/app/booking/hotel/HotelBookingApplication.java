package com.app.booking.hotel;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelBookingApplication {
    public static void main(String[] args){
        Builder builder = Student.getBuilder();
       // builder.setId(2);
        Student s = builder.build();
    }
}
