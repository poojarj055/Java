// Given a list of strings, count the number of distinct words.

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("abc", "z", "mnb", "abc", "mnb", "distinct");

       long distinctWord=str.stream().distinct().count();
        
        System.out.println(distinctWord);
    }
}
