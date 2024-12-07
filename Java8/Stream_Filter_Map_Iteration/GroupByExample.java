import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Group words by their length
        Map<Integer, List<String>> groupedByLength = words.stream()
                                                          .collect(Collectors.groupingBy(String::length));

       // System.out.println(groupedByLength.stream().filter());
    }
}

/*

5. Grouping Data (Grouping by Length of String):
Let's say we have a list of words, and we want to group them by their length.

Explanation:

groupingBy(String::length) groups the words based on their length.
Collectors.groupingBy creates a map where the keys are the length of the words, and the values are lists of words of that length.

    output 

{4=[date], 5=[apple], 6=[banana, cherry], 10=[elderberry]}
*/
