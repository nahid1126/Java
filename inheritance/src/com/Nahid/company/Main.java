package com.Nahid.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person=new Person("Nahid","Hasan",23);

        System.out.println(person.getFirstName());
        Employee employee=new Employee("Tareq","Islam",25);
        System.out.println(employee.getFirstName());
        employee.setID(1131);

        System.out.println(employee.getID());
    }
}
