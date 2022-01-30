package nahid.predicatel_interface;

import java.util.ArrayList;
import java.util.List;
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


        Predicate<Suffix> suffixPredicate = e -> (e.salary > 15000 && e.exp >= 2);
        Suffix suffix = new Suffix("Nahid", 20000, 1);

        String x = suffixPredicate.test(suffix) ? suffix.name : "you are less salary or experience";
        System.out.println(x);


        List<Suffix> suffixList = new ArrayList<>();

        suffixList.add(new Suffix("Nahid", 20000, 1));
        suffixList.add(new Suffix("Joy", 30000, 2));
        suffixList.add(new Suffix("Bhuiyan", 30000, 3));
        suffixList.add(new Suffix("Naimur", 30000, 3));


        for (Suffix s : suffixList) {
            if (suffixPredicate.test(s)) System.out.println(s.name + " " + s.salary);
        }
    }
}

class Suffix {
    String name;
    int salary, exp;

    public Suffix(String name, int salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }
}
