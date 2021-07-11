package com.Nahid.company;

public class Employee extends Person {
    private int ID;
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public Employee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
}
