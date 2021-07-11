package com.Nahid.company;

public class Cse {
    String name, id;
    int credit;
    public Cse(String name, String id, int credit)
    {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }
    void display() {
        System.out.println(id + " " + name + " "
                + credit);
    }
    void update(String name){
        this.name=name;
        System.out.println("Updated Course Name!");
    }
    void courseFee(int credit){
        int total = 2500*credit;
        System.out.println("Total: " +total);
    }
}
