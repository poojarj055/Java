// Given a list of strings, concatenate all of them into a single string separated by commas using streams.

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      List<String> str = Arrays.asList("I", "have", "to", "Concatenate");
      String output = str.stream().collect(Collectors.joining(", "));
      System.out.println(output);

  }
}
