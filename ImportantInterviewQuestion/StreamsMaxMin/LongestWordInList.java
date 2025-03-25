import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Problem: Given a list of words, find the longest word.
        List<String> words = Arrays.asList("banana", "apple", "watermelon", "grape");
        System.out.println(words.stream().max(Comparator.comparing(String::length)).orElse(null));
    }
}
