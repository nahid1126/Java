package nahid.FlatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        //multiple list to single list
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        //add into list to list of integer
        List<List<Integer>> finalList = Arrays.asList(list, list2, list3);
        System.out.println(finalList);

        //now add into stream to store single list
        List<Integer> newList = finalList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(newList);

        //now add 5 to new list
        List<Integer> newList2 = finalList.stream().flatMap(s -> s.stream().map(n -> n + 5)).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
