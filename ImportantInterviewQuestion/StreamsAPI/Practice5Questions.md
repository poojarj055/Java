Here are five of the most commonly asked Java Streams API coding questions in interviews:  

### 1. **Find the second-highest number in a list using Streams**  
   **Problem:** Given a list of integers, find the second-highest number using Java Streams.  
   **Solution:**  
   ```java
   import java.util.Arrays;
   import java.util.List;
   import java.util.Optional;

   public class SecondHighest {
       public static void main(String[] args) {
           List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 20);

           Optional<Integer> secondHighest = numbers.stream()
                   .distinct()
                   .sorted((a, b) -> b - a)
                   .skip(1)
                   .findFirst();

           secondHighest.ifPresent(System.out::println); // Output: 15
       }
   }
   ```

---

### 2. **Count occurrences of each word in a list using Streams**  
   **Problem:** Given a list of strings, count the occurrences of each word.  
   **Solution:**  
   ```java
   import java.util.*;
   import java.util.stream.Collectors;

   public class WordCount {
       public static void main(String[] args) {
           List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

           Map<String, Long> wordCount = words.stream()
                   .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

           System.out.println(wordCount); // Output: {orange=1, banana=2, apple=3}
       }
   }
   ```

---

### 3. **Convert a List of Strings to a Single String with Comma Separation**  
   **Problem:** Given a list of strings, concatenate them into a single comma-separated string.  
   **Solution:**  
   ```java
   import java.util.Arrays;
   import java.util.List;
   import java.util.stream.Collectors;

   public class StringJoin {
       public static void main(String[] args) {
           List<String> words = Arrays.asList("Java", "Python", "C++", "JavaScript");

           String result = words.stream().collect(Collectors.joining(", "));

           System.out.println(result); // Output: Java, Python, C++, JavaScript
       }
   }
   ```

---

### 4. **Find all even numbers in a list using Streams**  
   **Problem:** Given a list of integers, filter out the even numbers.  
   **Solution:**  
   ```java
   import java.util.Arrays;
   import java.util.List;
   import java.util.stream.Collectors;

   public class EvenNumbers {
       public static void main(String[] args) {
           List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

           List<Integer> evenNumbers = numbers.stream()
                   .filter(n -> n % 2 == 0)
                   .collect(Collectors.toList());

           System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
       }
   }
   ```

---

### 5. **Find the first non-repeating character in a String using Streams**  
   **Problem:** Given a string, find the first non-repeating character using Java Streams.  
   **Solution:**  
   ```java
   import java.util.LinkedHashMap;
   import java.util.Map;
   import java.util.function.Function;
   import java.util.stream.Collectors;

   public class FirstNonRepeatingChar {
       public static void main(String[] args) {
           String str = "swiss";

           Character firstNonRepeating = str.chars()
                   .mapToObj(c -> (char) c)
                   .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                   .entrySet()
                   .stream()
                   .filter(entry -> entry.getValue() == 1)
                   .map(Map.Entry::getKey)
                   .findFirst()
                   .orElse(null);

           System.out.println(firstNonRepeating); // Output: 'w'
       }
   }
   ```

These questions help in understanding filtering, mapping, sorting, collecting, and reducing operations in Java Streams. Let me know if you need more! 🚀
