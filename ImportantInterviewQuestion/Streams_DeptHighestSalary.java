import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //Find the Department with the Highest Average Salary
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 70000),
                new Employee("Bob", "IT", 120000),
                new Employee("Charlie", "IT", 110000),
                new Employee("David", "Finance", 95000),
                new Employee("Eve", "HR", 72000)
        );



        Map<String, Double> avg= employees.stream().
                collect(Collectors.groupingBy(d->d.department,
                Collectors.averagingInt(e->e.salary)));

        Map.Entry<String,Double> map=avg.entrySet().
                stream().
                max(Map.Entry.comparingByValue()).
                orElse(null);
        System.out.println("Deprtment with highest salary is "+map.getKey());

    }
}
