package com.app.booking.hotel.prototype;

public class Student implements Prototype<Student>{
    int id;
    String name;

    public Student(){

    }
    public Student(Student st){
        st.id = this.id;
        st.name = this.name;
    }
    public String getName() {
        System.out.println(" get name student :"+ name );
        return name;
    }

    public void setName(String name) {
        System.out.println(" set name student: "+name );
        this.name = name;
    }

    public int getId() {
        System.out.println(" get id student");
        return id;
    }

    public void setId(int id) {
        System.out.println(" set id student");
        this.id = id;
    }


    @Override
    public Student clone() {
        return new Student(this);
    }
}
