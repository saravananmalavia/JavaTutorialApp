import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLengthMapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Function to calculate the length of a string
        Function<String, Integer> stringLengthFunction = s -> s.length();

        // Transforming the list of names into their lengths
        List<Integer> lengths = names.stream()
                                     .map(stringLengthFunction)
                                     .collect(Collectors.toList());

        System.out.println(lengths); // Output: [5, 3, 7, 5]
    }
}
