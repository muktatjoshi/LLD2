package com.app.booking.hotel;

public class Student {

    int id;
    int name;
    int age;

    public static Builder getBuilder(){
        return new Builder();
    }

    public Student(Builder builder) {
        if(builder.getId() > 5){
            throw new IllegalArgumentException();
        }

        this.id = builder.id;
        this.name = builder.name;
    }
}
