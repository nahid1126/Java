package Nahid.ct;

class Try implements Runnable {
    public void run(){
        System.out.println("Run");
    }
}
public class Test {
    public static void main(String[] args) {
        Thread t=new Thread();
        t.start();
        System.out.println("Main");

        int x = 0;
        int y = 10;
        int z = x/y;
    }
}
