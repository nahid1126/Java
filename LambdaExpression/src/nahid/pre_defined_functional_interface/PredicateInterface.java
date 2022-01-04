package nahid.pre_defined_functional_interface;

import java.util.function.Predicate;

//predicate interface & it will have only one abstract method name test & it takes one parameter and return boolean
//when we want to use conditional check then we use predicate interface
public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = i -> (i > 10);
        System.out.println(integerPredicate.test(10));
        System.out.println(integerPredicate.test(8));

        Predicate<String> stringPredicate = str -> (str.length() > 5);
        System.out.println(stringPredicate.test("Hello Suffix!"));
        System.out.println(stringPredicate.test("Hello"));

        String names[] = {"NahidHasan", "Hasan", "Sajon", "Saiful", "Tareq"};
        for (String name : names) {
            if (stringPredicate.test(name)) {
                System.out.println(name);
            }
        }
    }
}
