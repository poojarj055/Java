//Question - Calculate the product of all numbers in a list 
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      List<Integer> str = Arrays.asList(5, 3, 2, 5, 1, 9);
      int product = str.stream()
                                   .reduce(1, (a,b)-> a*b);
       System.out.println(product);
  }
}


