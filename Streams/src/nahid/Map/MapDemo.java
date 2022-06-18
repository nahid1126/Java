package nahid.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 7, 8, 4, 3, 9, 10);
        List<Integer> addingList;

        addingList = integerList.stream().map(i -> i + 3).collect(Collectors.toList());

        System.out.println(addingList);
    }
}
