package nahid.functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PassingObject {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nahid Hasan", 20000));
        empList.add(new Employee("Al-Amin", 25000));
        empList.add(new Employee("Naimur Rahman", 30000));
        empList.add(new Employee("Nayeem Bhuiyan", 30000));

        Function<Employee, Integer> function = i -> {
            int sal = i.salary;
            if (sal >= 10000 && sal <= 20000) return (sal * 10 / 100);
            else if (sal > 20000 && sal <= 30000) return (sal * 20 / 100);
            else if (sal > 30000 && sal <= 40000) return (sal * 30 / 100);
            else return (sal * 40 / 100);
        };

        for (Employee emp : empList) {
            int b = function.apply(emp);
            System.out.println("Name : " + emp.name + "\nSalary : " + emp.salary +"\nfBonus : " + b);
        }



    }
}

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
