package Nahid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] marks={90,70,65,80,85};
        boolean flag=true;
        Scanner input=new Scanner(System.in);
            while (flag){
                try {
                    int n;
                    System.out.print("Enter Student Roll: ");
                    n=input.nextInt();
                    System.out.println("Student Roll: "+n+" Marks obtained : "+marks[n]);
                    flag=false;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception is: "+e);
                }finally {
                    System.out.println("Finally, Thank you for joining our program");
                }
            }
    }
}
