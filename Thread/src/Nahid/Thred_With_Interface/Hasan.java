package Nahid.Thred_With_Interface;

public class Hasan implements Runnable{
    @Override
    public void run() {
        for (int i =1;i<=6;i++){
            System.out.println("Hi Hasan");
        }
    }
}
