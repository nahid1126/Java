package nahid.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

public class FilterWithMap {
    static int total;
    static Employee employee1;

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(1, "Nahid", 20000),
                new Employee(2, "Naimur", 30000), new Employee(3, "Joy", 25000),
                new Employee(4, "Sabbir", 10000), new Employee(5, "Hridoy", 10000));

        //find the list of employee which have salary below 18k
        List<String> listOfName = employeeList.stream().filter(s -> s.salary < 18000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(listOfName);

        //find the first employee which salary is below 18k
        String nameList = employeeList.stream().filter(s -> s.salary < 18000).map(Employee::getName).findFirst().get();
        System.out.println(nameList);

        //all employees total salary
        int total_salary = employeeList.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(total_salary);

        //first map with groupingBy id how many user are same id and then sum total salary
        List<Employee> employeeLists = Arrays.asList(new Employee(1, "Nahid", 20000),
                new Employee(2, "Naimur", 30000),
                new Employee(1, "Nahid", 25000),
                new Employee(2, "Naimur", 10000),
                new Employee(3, "Sabbir", 10000));
        Map<Integer, List<Employee>> employee = employeeLists.stream().collect(Collectors.groupingBy(Employee::getId));

        List<Employee> newEmployee = new ArrayList<>();


        employee.forEach((key, value) -> {
            total = 0;
            value.forEach(emp -> {
                employee1 = emp;
                total += emp.getSalary();
            });
            newEmployee.add(new Employee(employee1.getId(), employee1.getName(), total));
        });

        System.out.println(newEmployee);

        //how many employee are same name
        Map<String, Long> sameName = employeeLists.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(sameName);
    }
}
