import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1. You have a list of sentences. Your task is to find the most frequently occurring word in all the sentences.
        List<String> sentences = Arrays.asList(
                "java is powerful",
                "python is easy",
                "java is popular",
                "I love java"
        );
        Map<String, Long> wordCount=sentences.stream().flatMap(sentence -> Stream.of(sentence.split("\\s+")))
                .collect(Collectors.groupingBy(word->word ,Collectors.counting()));
        Map.Entry<String,Long> freqWord=wordCount
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println(freqWord);
    }
}
