// Given a list of strings, find the first non-empty string using streams.

import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("", "bat", "", "cat", "dog", "elephant");

        // Group strings by their length
      Optional<String> firstNonemptyStr = words.stream().filter(s -> !s.isEmpty()).findFirst();

        // Print the result
      System.out.println(firstNonemptyStr.orElse("No non-empty string found"));

    }
}
