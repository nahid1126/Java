package nahid.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int id;
    char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + ", grade=" + grade + '}';
    }
}

public class FlatMapWithClass {
    public static void main(String[] args) {

        List<Student> listOne = Arrays.asList(new Student("Nahid", 1126, 'A'), new Student("Palash", 1127, 'B'), new Student("Tareq", 1131, 'A'), new Student("Saiful", 1133, 'A'));
        List<Student> listTwo = Arrays.asList(new Student("Mamun", 1123, 'A'), new Student("Anik", 1121, 'A'), new Student("Nahid", 886, 'A'), new Student("Sajon", 1113, 'A'));

        //add into list to list of student
        List<List<Student>> newList = Arrays.asList(listOne, listTwo);

        //naw store into stream how many student have grade A
        Long count = newList.stream().flatMap(s -> s.stream().filter(student -> student.getGrade() == 'A')).count();
        System.out.println(count);

        List<String> newStream = newList.stream().flatMap(students -> students.stream().map(s -> s.name)).collect(Collectors.toList());
        System.out.println(newStream);
    }
}
