package Nahid.Thread_With_Lamda;

public class ThreadInLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i =1;i<=5;i++){
                System.out.println("Hello");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i =1;i<=5;i++){
                System.out.println("Nahid");
            }
        });

        t1.start();
        try {
            t1.join();
           // t1.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
