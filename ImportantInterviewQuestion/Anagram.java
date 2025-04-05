import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagram = sortString(s1).equals(sortString(s2));
        System.out.println(isAnagram); // true
    }

    private static String sortString(String str) {
        return str.chars()
                  .sorted()
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
    }
}
