import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Main {

    public static void main(String[] args) {
       //1.Find the second-highest salary from a list of employees.
//        List<Employee> emp=Arrays.asList(new Employee(3400),
//                new Employee(4500),
//                new Employee(6500),
//                new Employee(6500),
//                new Employee(5000));
//       int secondHighSal= emp.stream().
//               map(employee->employee.salary).
//               distinct().
//               sorted((a,b)->b-a).
//               skip(1).
//               findFirst().orElse(-1);
//        System.out.println(secondHighSal);

        //2.Convert a list of strings into a map where the key is the string and the value is its length.
//        List<String> list=List.of("This", "is", "Example");
//        Map<String, Integer> map = list.stream()
//                .collect(Collectors.toMap(s -> s, String::length));
//        System.out.println(map);

        //3.Find duplicate elements in a list of integers using stream
//        List<Integer> integerList=List.of(4,7,3,4,7,1,2,4);
//        integerList.stream().
//                collect(Collectors.groupingBy(n->n, Collectors.counting())).
//                entrySet().
//                stream().
//                filter(entry->entry.getValue()>1).
//                map(Map.Entry::getKey).
//                collect(Collectors.toList()).
//                forEach(s->System.out.print(s+" "));
        //4.Sort a list of employees first by salary in descending order and then by name in ascending order.
//                List<Employee> emp2=Arrays.asList(new Employee(3400, "Ram"),
//                new Employee(4500, "Shyam"),
//                new Employee(6500, "Sita"),
//                new Employee(6500, "Gita"),
//                new Employee(5000, "Asha"));
//
//        emp2.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed()
//                        .thenComparing(Employee::getName))
//                .forEach(System.out::println);

// Alternative approach using custom comparator:
//                emp2.stream().
//                        sorted((e1,e2) ->{
//                            int salaryComparsion= Integer.compare(e2.salary, e1.salary);
//                            if(salaryComparsion!=0){
//                                return salaryComparsion;
//                            }
//                            return e1.name.compareTo(e2.name);
//                        }).collect(Collectors.toList()).forEach(System.out::println);
        
        //5.Find the sum of all even numbers in a given range using IntStream.
//       int sumevenNum= IntStream.range(1,20).
//                filter(n->n%2==0).
//                reduce(0,(a,b)->a+b); // can use sum() method also
//        System.out.println(sumevenNum);
        
    }
}
