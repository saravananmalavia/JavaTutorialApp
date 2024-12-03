import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4)); // Output: true
        System.out.println("Is 7 even? " + isEven.test(7)); // Output: false
    }
}
