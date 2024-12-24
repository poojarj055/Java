//Question - Given a list of strings and a character, count how many strings start with "a" using streams and lambda expressions.


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      List<String> str = Arrays.asList("abv", "ab", "!", "bcde", "jkl", "#", "(");
      Long countValue = str.stream()
                                   .filter(s -> s.charAt(0) == 'a') 
                                   .count(); // Use count() directly but make sure its of data type Long
       System.out.println(countValue);
  }
}
