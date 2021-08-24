package Nahid.Thread_With_SynchronizedMethos;

public class SynchronizedMethod extends Thread{
    int m;
    String s;

    public SynchronizedMethod(int m, String s) {
        this.m = m;
        this.s = s;
    }

   public synchronized void print(int m,String s){
        for(int i=1;i<=4;i++){
            System.out.println(s+": "+i*m);
        }
    }
    public void run(){
        print(m,s);
    }
}
