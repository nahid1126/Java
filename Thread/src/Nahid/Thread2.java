package Nahid;

public class Thread2 extends Thread{
    int m;

    public Thread2(int m) {
        this.m = m;
    }
    public void run(){
        print(m);
    }

     void print(int m) {
        for(int i=1;i<=m;i++){
            System.out.println("hello nahid i'm form thread2");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
