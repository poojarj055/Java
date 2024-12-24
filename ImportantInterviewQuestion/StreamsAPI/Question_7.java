// Filter out odd numbers from a list of integers, then calculate the sum of the squares of the remaining numbers.


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      List<Integer> number = Arrays.asList(5, 3, 2, 4, 1, 9);
      int output = number.stream()
                       .filter(n -> n%2!=0)
                       .map(x -> x*x)
                       .reduce(0, (a,b)->a+b);
                    
       System.out.println(output);
  }
}
