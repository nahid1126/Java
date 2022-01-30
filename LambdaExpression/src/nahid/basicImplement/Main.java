package nahid.basicImplement;

interface LambdaExp { //functional interface without parameter
    //functional interface means here will be only one abstract method

    void tryLambda();
}

interface LambdaExpWithParameter { //functional interface with tow parameter
    int tryLambda(int a, int b);

    default String lambdaTry(String name) {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {

        //functional interface implements and print
        LambdaExp lambdaExp = () -> System.out.println("I'm from lambda functional interface");
        lambdaExp.tryLambda();


        //functional interface implements and print with return value
        LambdaExpWithParameter withParameter = (a, b) -> {
            System.out.print(a + " + " + b + " = ");
            return a + b;
        };

        System.out.println(withParameter.tryLambda(8, 5));

        withParameter = (a, b) -> (a * b);
        System.out.println(withParameter.tryLambda(8, 5));
        System.out.println(withParameter.lambdaTry("nahid"));
    }
}
