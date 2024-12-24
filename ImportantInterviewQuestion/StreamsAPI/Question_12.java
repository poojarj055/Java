// Given a list of strings, check if all strings in the list are palindromes using streams.

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("abc", "how", "did", "abc", "mom", "bob");
        
        List<String> allPalindrome=str.stream().filter(s-> isPalindrome(s)).collect(Collectors.toList());
        System.out.println(allPalindrome);
       
    }
       private static boolean isPalindrome(String s){
         String reversed=new StringBuilder(s).reverse().toString();
         return s.equals(reversed);
       }
    
}


