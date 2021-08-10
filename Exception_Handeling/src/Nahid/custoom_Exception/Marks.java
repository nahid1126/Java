package Nahid.custoom_Exception;

import java.util.Scanner;

public class Marks {
    static void testMarks(int t) throws CustomException{
        if(t<50){
            throw new CustomException("Resubmit report your marks is less then 50%");
        }
    }
    static void finalMarks(int t,int f)throws CustomException{
        if((t+f)<80){
            throw new CustomException("Your got "+t+" and "+f+" marks");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t,f;
        System.out.println("Enter Test and Final Marks");
        t=in.nextInt();
        f=in.nextInt();
        try {
            testMarks(t);
        }catch (CustomException e) {
            System.out.println("exception "+e);
        }
        try {
            finalMarks(t,f);
        }catch (CustomException e) {
            System.out.println("exception "+e);
        }
    }
}
