package Nahid;


////Name: Nahid Hasan
////ID: 04170201126
////Mail: nahidnub1126@gmail.com

import java.io.*;
import java.util.Scanner;

public class Main {
    static Covid[] arr = new Covid[100];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // object create hear
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Covid();
        }
        menu();
    }

    //for menu
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
                ||      Select 6 to Save and Exit                   ||
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
            case 6 -> saveFile();
            default -> {
                System.out.println("\t\t\tPlease Enter the correct one\n");
                menu();
            }
        }
    }


    //for select 1
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

            arr[i].name = Name;
            arr[i].age = age;
            arr[i].gender = gender;
            arr[i].NID = nid;

            System.out.println("\n");
        }

        System.out.println("\n\n\n");
        menu();
    }


    //for select 2
    static void checkForVaccine() {
        System.out.println("\n\n\n||--------------------------------------------------||");
        System.out.println("||                  Check Eligible                  ||");
        System.out.println("||--------------------------------------------------||");
        System.out.println("||-------------Please Enter Your NID number---------||\n");
        String vaccine, hospital;
        int nid = in.nextInt();
        in.nextLine();


        for (int i = 0; i < arr.length; i++) {
            if (nid == arr[i].NID) {
                if (arr[i].gender.equals("female")) {
                    System.out.print("\t\t\tAre you  pregnant?-> ");
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
                            vaccine = in.nextLine();

                            System.out.println("\t\t\tWhich Hospital you want?");
                            System.out.println("\t\t\tSquare, Popular, DMC");
                            System.out.print("\t\t\tType---------> ");
                            hospital = in.nextLine();

                            arr[i].vacc = vaccine;
                            arr[i].hos = hospital;

                            System.out.println("\t\t\tYour Registration Done\n\t\t\tWe will let you know the date");
                            System.out.println("||--------------------------------------------------||\n\n");

                            menu();
                        }
                    }
                } else if (arr[i].gender.contains("male")) {
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
                        vaccine = in.nextLine();

                        System.out.println("\t\t\tWhich Hospital you want?");
                        System.out.println("\t\t\tSquare, Popular, DMC");
                        System.out.print("\t\t\tType----------> ");
                        hospital = in.nextLine();

                        arr[i].vacc = vaccine;
                        arr[i].hos = hospital;

                        System.out.println("\t\t\tYour Registration Done\n\t\t\tWe will let you know the date");
                        System.out.println("||--------------------------------------------------||\n\n");
                        menu();
                    }
                }

            }

        }
    }

    //for select 3
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

    //for select 4
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


    //for select 5
    static void seeVaccination() {
        System.out.println("\n\n\n||----------------------------------------------------------------||");
        System.out.println("||                      Vaccine Taken People                      ||");
        System.out.println("||----------------------------------------------------------------||");
        System.out.println("||\tName |\tAge |\tGender |\tNID     |\tVacName |\tHospital  ||\n");

        try {
            FileInputStream fis = new FileInputStream("F:\\Java\\Covid-19\\src\\Nahid\\CovidCase.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arr = (Covid[]) ois.readObject();
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i].vacc != null) && (arr[i].hos != null)) {
                    System.out.println(arr[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("||----------------------------------------------------------------||\n\n");
        menu();
    }

    ///for select 6
    static void saveFile() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].vacc != null && arr[i].hos != null) {
                try {
                    FileOutputStream file = new FileOutputStream("F:\\Java\\Covid-19\\src\\Nahid\\CovidCase.txt");
                    ObjectOutputStream stream = new ObjectOutputStream(file);
                    stream.writeObject(arr);
                    stream.close();
                    file.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
