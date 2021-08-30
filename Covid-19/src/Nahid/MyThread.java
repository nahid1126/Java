package Nahid;
////Name: Nahid Hasan
////ID: 04170201126
////Mail: nahidnub1126@gmail.com
public class MyThread extends Thread{
    String thName;

    public MyThread(String thName) {
        this.thName = thName;
    }

    public void run() {
        printRandom(thName);
    }

    void printRandom(String thName) {
        System.out.println("||\t\t\t\t\t" + thName + ": " + (int) (Math.random() * 100) + "\t\t\t\t\t\t  ||");
        System.out.println("||----------------------------------------------------||");
    }
}
