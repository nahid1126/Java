package Nahid;

///Name: Nahid Hasan
///ID:04170201126
///mail:bahidnub1126@gmail.com

class MyThread extends Thread {
    int amount;
    String name;

    public MyThread(int amount,String name) {
        this.name = name;
        this.amount = amount;
    }

    public void run(){
        taxCount(amount,name);
    }
    public void taxCount(int amount,String name){
        System.out.println(name+" deposit amount "+amount+" AND tax amount "+(amount*0.30));
    }

}

public class Ques1 {

    public static void main(String[] args) {
        // write your code here
        MyThread t1=new MyThread(5000,"Rakib");
        MyThread t2=new MyThread(6000,"Abir");

        t1.start();
        t2.start();

    }
}
