package nahid.functional_Interface;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {

        //for normal function
        Function<Integer, Integer> f = n -> n * n;
        System.out.println(f.apply(5));


        Function<String, Integer> fu = n -> n.length();
        System.out.println(fu.apply("Nahid Hasan"));

        //Function chaining

        Function<Integer, Integer> function = i -> i * i;
        Function<Integer, Integer> functionTwo = i -> i * i * i;

        //andThen first for function then work for functionTwo
        System.out.println("For andThen method" + function.andThen(functionTwo).apply(2));

        //andThen first for functionTwo then work for function reverse andThen
        System.out.println(function.compose(functionTwo).apply(5));
    }
}
