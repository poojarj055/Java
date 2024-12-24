// Find the maximum value in a list of integers 

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      List<Integer> str = Arrays.asList(5, 3, 2, 5, 1, 9);
      int max = str.stream().max(Comparator.naturalOrder()).get();
       System.out.println(max);
  }
}
