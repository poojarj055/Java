import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //You have a list of students, each taking multiple courses. Find students who have taken all available courses.
        Map<String, List<String>> studentCourses = Map.of(
                "Alice", Arrays.asList("Math", "Science", "History"),
                "Bob", Arrays.asList("Math", "Science"),
                "Charlie", Arrays.asList("Math", "Science", "History")
        );

       Set<String> allCourses= studentCourses.values().stream().flatMap(List::stream).collect(Collectors.toSet());

      List<String> student= studentCourses.entrySet().stream().
               filter(entry->new HashSet<>(entry.getValue()).equals(allCourses)).
               map(Map.Entry::getKey).
               //collect(Collectors.toList());
        toList();
        System.out.println(student);


    }
}
