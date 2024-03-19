package com.app.booking.hotel;
//builder class
public class Builder {
    int id;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    int name;
    int age;

    public int getId() {
        return id;
    }
    

    public Student build(){
        return new Student(this);
    }
}
