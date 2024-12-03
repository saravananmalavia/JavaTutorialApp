import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "John", "Annie");

        // Filter names starting with "A" and collect them into a list
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [Alice, Amanda, Annie]
    }
}


/*

1. Filtering and Collecting Data:
Let’s say we have a list of names, and we want to filter those that start with the letter "A" 
and collect them into a new list.

Explanation:

filter(name -> name.startsWith("A")) filters names that start with the letter "A".
collect(Collectors.toList()) collects the filtered names into a new list.

*/