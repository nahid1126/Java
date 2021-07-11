package com.Nahid.company;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    String situation;

    void setInformation(int patientId,String name,int age,String situation){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.situation=situation;
    }


    void updateSituation(String situation){

        this.situation=situation;
        //System.out.println("ID: "+patientId+"\nName: "+name+"\nAge: "+age+"\n"+situation);
    }
    void getInformation(){
        System.out.println("ID: "+patientId+"\nName: "+name+"\nAge: "+age+"\nSituation: "+situation);
    }
}
