package nahid.Filter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterWithObject {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Hp", 35000));
        productList.add(new Product(2, "Dell", 30000));
        productList.add(new Product(3, "MacBook", 135000));
        productList.add(new Product(4, "Lenovo", 28000));
        productList.add(new Product(5, "Sony", 38000));
        productList.add(new Product(6, "Xiaomi", 90000));

        productList.stream().filter(p -> p.price > 28000).forEach(p -> System.out.println("ID : " + p.id + " Name : " + p.name + " Price : " + p.price));

        List<Product> list = productList.stream().filter(p -> p.price > 28000).collect(Collectors.toList());

    }
}
