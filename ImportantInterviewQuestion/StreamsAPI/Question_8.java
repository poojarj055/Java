// Group strings in a list by their length using streams and collectors


import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "banana", "cat", "dog", "elephant");

        // Group strings by their length
        Map<Integer, List<String>> groupedByLength = words.stream()
                                                          .collect(Collectors.groupingBy(String::length));

        // Print the result
        System.out.println(groupedByLength);
    }
}

