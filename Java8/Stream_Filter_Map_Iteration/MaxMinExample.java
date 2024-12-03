import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

        // Finding the maximum number
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(m -> System.out.println("Max: " + m));  // Output: Max: 9

        // Finding the minimum number
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(m -> System.out.println("Min: " + m));  // Output: Min: 1
    }
}


/*

4. Finding Maximum/Minimum Value:
We have a list of integers and want to find the maximum and minimum values.

Explanation:

max(Integer::compareTo) finds the maximum value by comparing integers.
min(Integer::compareTo) finds the minimum value by comparing integers.
The Optional type is used to handle the case where the list might be empty.





*/