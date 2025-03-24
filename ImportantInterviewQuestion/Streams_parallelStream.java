import java.util.*;


public class Main {
    public static void main(String[] args) {
        //You have a log file with 1 million entries. Find the number of ERROR logs using parallel processing.
        List<String> logs = Arrays.asList(
                "INFO: Application started",
                "ERROR: Database connection failed",
                "INFO: User logged in",
                "ERROR: Server crashed"
        );

        System.out.println("Total Error logs: "+ logs.parallelStream().filter(s->s.startsWith("ERROR")).count());


    }
}
