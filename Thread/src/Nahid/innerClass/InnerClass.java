package Nahid.innerClass;

class Tania {
    static class Cosmetics {
        void makho() {
            System.out.println("basi kore makho");
            class Makhci {
                void makbo() {
                    System.out.println("aro basi kore makhmu");
                }
            }
            Makhci ma = new Makhci();
            ma.makbo();
        }

    }
}

class Tareq {
    void islam() {
        System.out.println("Hello tareq");
    }
}

 class Anik {
    static void disply(){
        System.out.println("hi");
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Tania.Cosmetics c = new Tania.Cosmetics();
        c.makho();

        Tareq ta = new Tareq() {
            void islam() {
                System.out.println("i'm anonymous");
            }
        };
        ta.islam();

        Anik.disply();
    }
}
