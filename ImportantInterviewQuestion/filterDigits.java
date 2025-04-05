import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("ABC", "DEF", "12", "43", "50", "GHI");

        list.stream()
            .filter(str -> str.matches("\\d+")) // filters strings that contain only digits
            .forEach(System.out::println);     // prints: 12, 43, 50
    }
}
