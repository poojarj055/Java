// Reverse a list of integers using the reduce() method.
// Hint: You will need to work with a mutable list or string builder.

import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(11,7,2,4,9,5);
        List<Integer> reversedlist= new ArrayList<>(numbers);
        Collections.reverse(reversedlist);
        System.out.println(reversedlist);

    }
}
  //-----------ABOVE METHOD MANUALLY REVERSES THE NUMBER--------------------




