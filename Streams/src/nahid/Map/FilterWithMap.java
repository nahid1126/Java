package nahid.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    public int id;
    public String name;
    public int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class FilterWithMap {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "Nahid", 20000),
                new Employee(2, "Naimur", 30000),
                new Employee(3, "Joy", 25000),
                new Employee(4, "Bhuiyan", 30000),
                new Employee(5, "Sabbir", 10000));

        List<String> nameList = employeeList.stream().filter(s -> s.salary > 18000).map(s -> s.name).collect(Collectors.toList());
        System.out.println(nameList);
    }
}
