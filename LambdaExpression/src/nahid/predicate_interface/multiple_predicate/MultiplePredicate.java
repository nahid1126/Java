package nahid.predicate_interface.multiple_predicate;

import java.util.function.Predicate;

public class MultiplePredicate {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70};
        Predicate<Integer> predicate = i -> (i % 2 == 0 && i > 10);

        for (int n : arr) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }

        //another way joining two predicates using and, or, negate operator
        int array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70};
        Predicate<Integer> pr = i -> i % 2 == 0;
        Predicate<Integer> pre = i -> i > 10;

        System.out.println("another way to check and");
        for (int n : array) {
            if (pr.and(pre).test(n)) {
                System.out.println(n + " ");
            }
        }
        System.out.println("to check or");
        for (int n : array) {
            if (pr.or(pre).test(n)) {
                System.out.println(n + " ");
            }
        }
        System.out.println("to check negate");  //returns bool values
        for (int n : array) {
            if (pre.negate().test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
