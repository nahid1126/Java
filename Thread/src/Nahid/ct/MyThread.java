package Nahid.ct;

public class MyThread {
    public static void main(String[] args) {
        Runnable r = new Runnable(){

            @Override
            public void run() {
                System.out.print("Child Thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        System.out.print("Main Thread");
    }
}
