package Nahid;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Information[] arr = new Information[100];
    static Scanner in = new Scanner(System.in);
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        // write your code here
        menu();
    }

    public static void menu() {
        int op;
        System.out.println("||--------------------------------------------------||");
        System.out.println("||                      MENU                        ||");
        System.out.println("||--------------------------------------------------||");
        System.out.print("""
                ||      Select 1 to enter new covid cases.          ||
                ||      Select 2 to take Vaccination.               ||
                ||      Select 3 to get Vaccination Information.    ||
                ||      Select 4 Take a THREAD class                ||
                ||      Select 5 to see Vaccination                 ||
                ||      Select 6 to Exit                            ||
                """);
        System.out.print("||--------------------------------------------------||");
        System.out.print("\n\n\t\t\tChose your Option --> ");
        op = in.nextInt();
        in.nextLine();
        switch (op) {
            case 1 -> info();
            case 2 -> checkForVaccine();
            case 3 -> vaccination();
            case 4 -> tryThread();
            case 5 -> seeVaccination();
            case 6 -> exit(0);
            default -> {
                System.out.println("\t\t\tPlease Enter the correct one\n");
                menu();
            }
        }
    }

    static void info() {
        String Name, gender;
        int nid;
        int age;
        System.out.println("\n\n\n||--------------------------------------------------||");
        System.out.println("||                  Information                     ||");
        System.out.println("||--------------------------------------------------||");
        System.out.print("\t\t\tHow many new covid-19 case? ");

        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < 100; i++) {
            arr[i] = new Information();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\t\t\tEnter your Name-> ");
            Name = in.nextLine();
            System.out.print("\t\t\tEnter your Age-> ");
            age = in.nextInt();
            in.nextLine();
            System.out.print("\t\t\tEnter your Gender-> ");
            gender = in.nextLine();
            System.out.print("\t\t\tEnter your nid-> ");
            nid = in.nextInt();
            in.nextLine();

            arr[i].setName(Name);
            arr[i].setAge(age);
            arr[i].setGender(gender);
            arr[i].setNID(nid);

            System.out.println("\n");
//            builder.append(arr[i].name).append(" ").append(arr[i].age).append(" ")
//                    .append(arr[i].gender).append(" ").append(arr[i].NID).append("\n");
        }
//        String s = builder.toString();
//        try {
//            FileWriter f = new FileWriter("F:\\Java\\Covid-19\\src\\Nahid\\CovidCase.txt", true);
//            f.write(s+"\n");
//            f.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("\n\n\n");
        menu();
    }

    static void checkForVaccine() {
        System.out.println("\n\n\n||--------------------------------------------------||");
        System.out.println("||                  Check Eligible                  ||");
        System.out.println("||--------------------------------------------------||");
        System.out.println("||-------------Please Enter Your NID number---------||\n");
        //String nid = in.nextLine();
        String vaccine, hospital;
        int nid = in.nextInt();
        in.nextLine();

//        try {
//            Scanner fScanner = new Scanner(new FileInputStream("F:\\Java\\Covid-19\\src\\Nahid\\CovidCase.txt"));
//            while (fScanner.hasNextLine()) {
//                String line = fScanner.nextLine();
//
//                if (line.contains(nid) && line.contains("female")) {
//                    System.out.println("Are you  pregnant?");
//                    String str = in.nextLine();
//                    if (str.equals("yes")) {
//                        System.out.println("you are not eligible for vaccine");
//                        menu();
//                    } else {
//                        System.out.println("Are you sill positive?");
//                        String str1 = in.nextLine();
//                        if (str1.equals("yes")) {
//                            System.out.println("you are not eligible for vaccine");
//                            menu();
//                        } else {
//                            System.out.println("Which vaccine you want?");
//                            System.out.println("Moderna Pfizer AstraZeneca");
//                        }
//                    }
//                } else if (line.contains(nid)) {
//                    System.out.println("Are you sill positive?");
//                    String str1 = in.nextLine();
//                    if (str1.equals("yes")) {
//                        System.out.println("you are not eligible for vaccine");
//                        menu();
//                    } else {
//                        System.out.println("Which vaccine you want?");
//                        System.out.println("Moderna Pfizer AstraZeneca\ntype.......");
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        for (int i = 0; i < arr.length; i++) {
            if (nid == arr[i].getNID()) {
                if (arr[i].getGender().contains("female")) {
                    System.out.print("\t\t\t you  pregnant?-> ");
                    String str = in.nextLine();
                    if (str.equals("yes")) {
                        System.out.println("\t\t\tyou are not eligible for vaccine");
                        System.out.println("||--------------------------------------------------||\n\n");
                        menu();
                    } else {
                        System.out.print("\t\t\tAre you sill positive?-> ");
                        String str1 = in.nextLine();
                        if (str1.equals("yes")) {
                            System.out.println("\t\t\tyou are not eligible for vaccine");
                            System.out.println("||--------------------------------------------------||\n\n");
                            menu();
                        } else {
                            System.out.println("\t\t\tWhich vaccine you want?");
                            System.out.println("\t\t\tModerna, Pfizer, AstraZeneca");
                            System.out.print("\t\t\tType---------> ");
                            //String va = in.nextLine();
                            vaccine = in.nextLine();
                            System.out.println("\t\t\tWhich Hospital you want?");
                            System.out.println("\t\t\tSquare, Popular, DMC");
                            System.out.print("\t\t\tType---------> ");
                            //String ho = in.nextLine();
                            hospital = in.nextLine();
                            arr[i].setVacc(vaccine);
                            arr[i].setHos(hospital);
//                            builder.append(arr[i].getName()).append(" ").append(arr[i].getAge()).append(" ")
//                                    .append(arr[i].getGender()).append(" ").append(arr[i].getNID()).append(" ")
//                                    .append(va).append(" ").append(ho).append("\n");

                            //appended();
                            // menu();
                        }
                    }
                } else if (arr[i].getGender().contains("male")) {
                    System.out.print("\t\t\tAre you sill positive?--> ");
                    String str1 = in.nextLine();
                    if (str1.equals("yes")) {
                        System.out.println("\t\t\tyou are not eligible for vaccine");
                        System.out.println("||--------------------------------------------------||\n\n");
                        menu();
                    } else {
                        System.out.println("\t\t\tWhich vaccine you want?");
                        System.out.println("\t\t\tModerna, Pfizer, AstraZeneca");
                        System.out.print("\t\t\tType---------> ");
                        //String va = in.nextLine();
                        vaccine = in.nextLine();
                        System.out.println("\t\t\tWhich Hospital you want?");
                        System.out.println("\t\t\tSquare, Popular, DMC");
                        System.out.print("\t\t\tType----------> ");
                        // String ho = in.nextLine();
                        hospital = in.nextLine();
                        arr[i].setVacc(vaccine);
                        arr[i].setHos(hospital);
//                        builder.append(arr[i].getName()).append(" ").append(arr[i].getAge()).append(" ")
//                                .append(arr[i].getGender()).append(" ").append(arr[i].getNID()).append(" ")
//                                .append(va).append(" ").append(ho).append("\n");

                        //appended();
                        //menu();
                    }
                }
                if (arr[i].getVacc() == null && arr[i].getHos() == null) {
                    try {
                        FileOutputStream file = new FileOutputStream("F:\\Java\\Covid-19\\src\\Nahid\\CovidCase.txt", true);
                        ObjectOutputStream stream = new ObjectOutputStream(file);
                        stream.writeObject(arr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

//    static void appended() {
////        String newf = builder.toString();
////
////        System.out.println(newf);
//        if (arr[])
//        try {
//            FileWriter f = new FileWriter("F:\\Java\\Covid-19\\src\\Nahid\\CovidCase.txt", true);
//            f.write(newf);
//            f.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("\n\n\t\t\tYour Registration Done\n\t\t\tWe will let you know the date");
//        System.out.println("||----------------------------------------------------||\n\n");
//    }

    static void vaccination() {
        System.out.println("\n\n\n||--------------------------------------------------||");
        System.out.println("||                 Vaccine Available                ||");
        System.out.println("||--------------------------------------------------||");
        try {
            Scanner read = new Scanner(new FileReader("F:\\Java\\Covid-19\\src\\Nahid\\Vaccination.txt"));
            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println("\t\t\t" + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("||--------------------------------------------------||\n\n");
        menu();
    }

    static void tryThread() {
        System.out.println("\n\n\n||----------------------------------------------------||");
        System.out.println("||                Thread Random Number                ||");
        System.out.println("||----------------------------------------------------||");
        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }


    static void seeVaccination() {
        System.out.println("\n\n\n||----------------------------------------------------||");
        System.out.println("||                Vaccine Taken People                ||");
        System.out.println("||----------------------------------------------------||");
        System.out.println("||\t\t\tName|Age|Gender|NID     | VacName|Hospital ||\n");
        try {
            Scanner read = new Scanner(new FileReader("F:\\Java\\Covid-19\\src\\Nahid\\CovidCase.txt"));
            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println("||\t\t\t" + line + "\t  ||\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("||----------------------------------------------------||\n\n");
        menu();
    }
}
