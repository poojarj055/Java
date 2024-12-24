// Calculate the average length of all strings in a list using streams.

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("vgyihbj", "ah", "did", "ad", "tyy", "vnbvnb");

        // Use mapToInt and average to calculate average length
        double avgLength = str.stream()
                              .mapToInt(String::length)
                              .average()
                              .orElse(0.0); // Default value if the list is empty

        System.out.println(avgLength);
    }
}


------------ABOVE one is recommended-----------------------------


import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("vgyihbj", "ah", "did", "ad", "tyy", "vnbvnb");
        
        int sumLength=str.stream().map(s-> s.length()).reduce(0, (a,b)-> a+b);
        double avgLength=(double)sumLength/str.size();
        System.out.println(avgLength);
       
    }
    
}








