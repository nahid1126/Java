package Nahid.Thread_With_SynchronizedMethos;

public class SynchronizedThread {
    public static void main(String[] args) {

        SynchronizedMethod obj = new SynchronizedMethod(2,"Nahid");
        SynchronizedMethod obj2 = new SynchronizedMethod(3,"Hasan");
        SynchronizedMethod obj3 = new SynchronizedMethod(4,"Tareq");
        SynchronizedMethod obj4 = new SynchronizedMethod(5,"Kamrul");
        SynchronizedMethod obj5 = new SynchronizedMethod(6,"Anik");
        SynchronizedMethod obj6 = new SynchronizedMethod(7,"Tania");

        obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        obj6.start();
    }
}
