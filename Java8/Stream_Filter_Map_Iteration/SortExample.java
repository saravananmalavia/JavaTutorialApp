import java.util.Arrays;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("mango","pinapple","apple", "banana", "cherry", "date");

        // Sort words in ascending order
        words.stream()
             .sorted()
             .forEach(System.out::println);
    }
}

/*

6. Sorting Data:
Sort a list of strings in ascending order.

Explanation:

sorted() sorts the elements in the stream in their natural order (alphabetically for strings).
forEach(System.out::println) prints each sorted word.





*/
