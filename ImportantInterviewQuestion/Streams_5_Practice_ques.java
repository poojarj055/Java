import java.util.*;
import java.util.stream.*;

public class StringStreamSolutions {
    public static void main(String[] args) {
        String str1 = "swiss";
        String str2a = "listen";
        String str2b = "silent";
        String str3 = "banana";
        String str4 = "Java is fun";
        String str5 = "programming";

        // 1. First Non-Repeating Character
        Character firstNonRepeat = str1.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);
        System.out.println("1. First Non-Repeating Character: " + firstNonRepeat);

        // 2. Anagram Check
        boolean isAnagram = str2a.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining())
            .equals(
                str2b.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining())
            );
        System.out.println("2. Are Anagrams: " + isAnagram);

        // 3. Count Occurrences of Each Character
        Map<Character, Long> charCount = str3.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("3. Character Frequencies: " + charCount);

        // 4. Reverse Each Word
        String reversedWords = Arrays.stream(str4.split(" "))
            .map(word -> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));
        System.out.println("4. Reverse Each Word: " + reversedWords);

        // 5. Remove Duplicate Characters
        String noDuplicates = str5.chars()
            .distinct()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());
        System.out.println("5. String without Duplicates: " + noDuplicates);
    }
}
