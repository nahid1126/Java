package Nahid.ct;

public class Try2 {
    public static void main(String[] args) {
        Simple s = new Simple();
        Simple r=new Simple();

        s.incr();
        r.incr();
        s.display();
        r.display();
    }
}
class Simple{
    static int a=5;
    void incr(){
        a++;
        System.out.println("incr "+a);
    }
    void display(){
        System.out.println("a = "+a);
    }
}
