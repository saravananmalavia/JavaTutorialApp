@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Single abstract method
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        // Using Lambda Expression
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.calculate(10, 5)); // Output: 15
        System.out.println("Subtraction: " + subtraction.calculate(10, 5)); // Output: 5
    }
}
