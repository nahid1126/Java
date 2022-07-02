package nahid.OtherMEthod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonTerminal {
    public static void main(String[] args) {
        List<String> distinctList = Arrays.asList("Car", "Bus", "Bike", "Cycle", "Car", "Bus", "Bike", "Cycle", "Car", "Bus", "Bike", "Cycle");

        //distinct()
        List<String> newList = distinctList.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);

        //limit()
        List<String> limitList = distinctList.stream().limit(2).collect(Collectors.toList());
        System.out.println(limitList);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //count()
        long count = integerList.stream().filter(n -> n % 2 == 0).count();

        //min()
        Optional<Integer> min = integerList.stream().min(Integer::compareTo);
        System.out.println(min);

        //max()
        Optional<Integer> max = integerList.stream().max(Integer::compareTo);
        System.out.println(max);

        //reduce()
        Optional<String> reduce = newList.stream().reduce((value, combine) -> value + combine);
        System.out.println(reduce.get());

        //toArray
        Object[] arr = distinctList.stream().toArray();
        System.out.println(arr.length);

        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
