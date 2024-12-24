// Given a list of words, create a map of word frequencies using streams.


import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ad", "am", "did", "ad", "am", "dad");
        
       // Use streams to compute the word frequencies
        Map<String, Long> wordFrequencies = str.stream()
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordFrequencies);
       
    }
    
}

