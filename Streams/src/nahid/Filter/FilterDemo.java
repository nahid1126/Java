package nahid.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(5, 6, 7, 8, 10, 15, 20, 25, 30, 35, 40, 45, 50);
        List<Integer> numStore = new ArrayList<>();

        // normal way to store one list to another
      /*  for (int n : num) {
            if (n%2==0)
                numStore.add(n);
        }
        System.out.println(numStore);*/

        //filter with single condition
//        numStore = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(numStore);

        //stream only print each element
        num.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

        //filter with multiple conditions

        numStore = num.stream().filter(n -> n % 2 == 0 && n > 7).collect(Collectors.toList());
        System.out.println("\nfilter with multiple conditions : " + numStore);
        System.out.println("filter with multiple conditions without store:");
        num.stream().filter(n -> n % 2 == 0 && n > 7).forEach(n -> System.out.println(n));
    }
}
