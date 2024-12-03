import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmailGenerator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Function to generate email address
        Function<String, String> generateEmail = name -> name.toLowerCase() + "@example.com";

        // Generating email addresses
        List<String> emails = names.stream()
                                   .map(generateEmail)
                                   .collect(Collectors.toList());

        System.out.println(emails); // Output: [alice@example.com, bob@example.com, charlie@example.com]
    }
}
