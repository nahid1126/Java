package Nahid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n,m;
        System.out.println("Enter N and M values");
        n=in.nextInt();
        m=in.nextInt();

        Thread1 t1 = new Thread1(n);
        Thread2 t2 = new Thread2(m);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
