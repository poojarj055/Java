import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Problem:Given a list of employees (name, years of experience), find the employee with the longest tenure.
        List<Employee> emp=Arrays.asList(new Employee("David",15),
                new Employee("John", 2),
                new Employee("Harry", 5));
        System.out.println(emp.stream().max(Comparator.comparing(e->e.yearsOfExperience)).orElse(null));
    }
}
