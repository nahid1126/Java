package Nahid.ct;

class Base{
    public  Base(){
        System.out.println("Base::show() called");
    }
}
class Derived extends Base{
    public Derived(){
      //  super();
        System.out.println("Derived::show() called");
    }
}
public class Try3 {
    public static void main(String[] args) {

        new Derived();

    }
}
