package com.Nahid.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Patient[] patients =new Patient[3];

        for (int i = 0; i < patients.length; i++) {
            patients[i]=new Patient();
        }

        patients[0].setInformation(1126,"Nahid",23,"good");
        patients[0].updateSituation("much better");
        patients[1].setInformation(1127,"Palash",25,"positive");

        patients[2].setInformation(1131,"Tareq",23,"Lockdown");
        patients[2].updateSituation("Shutdown");


        for (int i = 0; i <patients.length ; i++) {
            patients[i].getInformation();
        }
    }
}
