// Calculate the average length of all strings in a list using streams.

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("vgyihbj", "ah", "did", "ad", "tyy", "vnbvnb");
        
        int sumLength=str.stream().map(s-> s.length()).reduce(0, (a,b)-> a+b);
        double avgLength=sumLength/str.size();
        System.out.println(avgLength);
       
    }
    
}
