import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Map integers to their string representation
        List<String> stringNumbers = numbers.stream()
                                            .map(num -> "Number: " + num)
                                            .collect(Collectors.toList());

        System.out.println(stringNumbers); // Output: [Number: 1, Number: 2, Number: 3, Number: 4, Number: 5]
    }
}

/*

2. Mapping to a Different Type (Object to String)
Suppose we have a list of integers, and we want to convert each integer 
to its string representation, then collect them into a list.
Explanation:

map(num -> "Number: " + num) transforms each integer into a string prefixed with "Number: ".
collect


*/
