package Nahid.Thred_With_Interface;

public class ThreadInInterface {
    public static void main(String[] args) {
        Runnable na=new Nahid();
        Runnable ha=new Hasan();

        Thread t1 = new Thread(na);
        Thread t2 = new Thread(ha);

        t1.start();
        t2.start();
    }
}
