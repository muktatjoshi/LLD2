package com.app.booking.hotel.prototype;

public class IntelliStudent extends  Student{
    String iq;

    public IntelliStudent(){
    }
    public IntelliStudent(IntelliStudent st) {
        super(st);
        st.iq = this.iq;
    }

    public String getBatch() {
        System.out.println(" get batch intelligent student");
        return iq;
    }

    public void setBatch(String batch) {
        System.out.println(" set batch intelligent student");
        this.iq = batch;
    }

    @Override
    public IntelliStudent clone() {
        System.out.println("clone intelligent student");

        return new IntelliStudent(this);
    }
}
