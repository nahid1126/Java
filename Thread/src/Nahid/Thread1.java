package Nahid;

public class Thread1 extends Thread{
    int n;

    public Thread1(int n) {
        this.n = n;
    }

    public void run(){
        multi(n);
    }
    void multi(int n){
        for (int i=1;i<=n;i++) {
            System.out.println("Thered1: ");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
