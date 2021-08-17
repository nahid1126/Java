package Nahid.Thread_With_SynchronizedMethos;

public class SynchronizedThread {
    public static void main(String[] args) {

        SynchronizedMethod obj = new SynchronizedMethod(2,"Nahid");
        SynchronizedMethod obj2 = new SynchronizedMethod(3,"Hasan");

        obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
