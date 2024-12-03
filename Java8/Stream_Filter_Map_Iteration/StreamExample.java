import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Using Stream to filter, map, and iterate
        numbers.stream()
            .filter(num -> num % 2 == 0)        // Filter even numbers
            .map(num -> num * num)              // Square each number
            .forEach(System.out::println);      // Print each squared number
    }
}


/*


Explanation:
numbers.stream():

Converts the list of integers into a stream for further operations.
filter(num -> num % 2 == 0):

This filters out the odd numbers, keeping only the even numbers from the stream.
Condition: Only numbers divisible by 2 are kept.
map(num -> num * num):

This maps (transforms) each number to its square.
Transformation: Each even number is squared.
forEach(System.out::println):

This iterates over each element in the stream (the squared even numbers) and prints them to the console.

Summary of Functional Programming in Java with Streams
Filtering: filter() to select specific elements based on conditions.
Mapping: map() to transform elements.
Reducing: reduce() to aggregate values (like sum or product).
Sorting: sorted() to sort data.
Grouping: groupingBy() to group elements based on a criterion.
Matching: allMatch() and anyMatch() to check conditions.
Collecting: collect() to gather results into collections (like lists or maps).
Java Streams allow functional-style operations to be performed easily, making the code more readable, concise, and easier to maintain.


*/