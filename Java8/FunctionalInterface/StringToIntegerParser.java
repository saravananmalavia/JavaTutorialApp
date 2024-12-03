import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToIntegerParser {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4");

        // Function to parse a string into an integer
        Function<String, Integer> stringToInteger = Integer::parseInt;

        // Converting list of strings to integers
        List<Integer> integers = numbers.stream()
                                        .map(stringToInteger)
                                        .collect(Collectors.toList());

        System.out.println(integers); // Output: [1, 2, 3, 4]
    }
}
