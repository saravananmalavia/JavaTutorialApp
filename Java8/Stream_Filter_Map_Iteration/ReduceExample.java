import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use reduce to sum the numbers
        int sum = numbers.stream()
                         .reduce(0, (total, num) -> total + num);

        System.out.println("Sum: " + sum); // Output: Sum: 15
    }
}

/*

3. Reducing a List (Summing Numbers)
We have a list of numbers and want to find the sum of all the numbers.

Explanation:

reduce(0, (total, num) -> total + num):
0 is the initial value.
The lambda function (total, num) -> total + num adds each element of the stream to the accumulator (total).
This reduces the list to a single value (the sum of all elements).



*/


