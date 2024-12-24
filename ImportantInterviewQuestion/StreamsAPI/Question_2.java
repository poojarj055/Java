// Question : Given a list of strings, find the longest string

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      List<String> words = Arrays.asList("abv", "ab", "abcde");
      int length = words.stream()
                                  .map(s -> s.length()) 
                                  .max(Comparator.naturalOrder()).get(); 
       System.out.println(length);
  }
}
