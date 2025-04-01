import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


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
        //6.Group a list of employees by their department and count the number of employees in each department.
//        List<Employee> emp3=List.of(new Employee("ram", "IT",5000),
//                new Employee("shyam", "HR", 4500),
//                new Employee("sita","IT",600));
//        System.out.println(emp3.stream().collect(Collectors.groupingBy(n->n.department, Collectors.counting())));
      //7. Find the first non-repeating character in a string using streams.
//    String str="swiss";
//    Character nonRepeatingchar=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
//            .entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey)
//            .findFirst().orElse(null);
//        System.out.println(nonRepeatingchar);
    //8.Merge two lists of integers into a single sorted list without duplicates.
//        List<Integer> l1=List.of(12, 21, 10, 4, 21,1);
//        List<Integer> l2=List.of(2,31,12,10,5);
//        List<Integer> mergedList= Stream.concat(l1.stream(), l2.stream()).distinct().sorted().collect(Collectors.toList());
//        System.out.println(mergedList);
      //  9.Partition a list of numbers into two lists: one containing even numbers and the other containing odd numbers.
//    List<Integer> list=List.of(2,3,4,5,6,7,8,9);
//    Map<Boolean, List<Integer>> partioned=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
//    List<Integer> evenNum=partioned.get(true);
//    List<Integer> oddNum=partioned.get(false);
//        System.out.println("Even Num: "+evenNum);
//        System.out.println("Odd Num: "+oddNum);
        //10.Check if all elements in a list are unique using streams.
   //     List<Integer> listOfElements=List.of(2,2,3,4,9);
//        boolean isUnique = listOfElements.stream()
//                .distinct() // Remove duplicates
//                .count() == listOfElements.size();
//        System.out.println(isUnique);

    }
}
