import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //You have a list of employees with their salaries. Find the second-highest salary.
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 75000),
                new Employee("Bob", 120000),
                new Employee("Charlie", 110000),
                new Employee("David", 120000),
                new Employee("Eve", 90000)
        );

        employees.stream().
                map(emp->emp.salary).
                sorted((p1, p2)->p2 -p1).
                distinct().
                //limit(1).
                 skip(1).
                findFirst().
                ifPresent(sal->System.out.println("Second Highest Salary : "+sal));


    }
}
