import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Problem:Given a list of student names, find the student with the shortest name.
        List<String> students = Arrays.asList("Amit", "Jonathan", "Sam", "Elizabeth");
        System.out.println(students.stream().min(Comparator.comparingInt(String::length)).orElse(null));
        }
}
