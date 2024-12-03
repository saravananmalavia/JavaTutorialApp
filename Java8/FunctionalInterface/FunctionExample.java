import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Function to convert a string to its length
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println("Length of 'Functional': " + stringLength.apply("Functional")); // Output: 10
    }
}
