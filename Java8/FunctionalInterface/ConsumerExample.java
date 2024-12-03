import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer to print a string
        Consumer<String> printer = message -> System.out.println("Message: " + message);

        printer.accept("Hello, Functional Interface!"); // Output: Message: Hello, Functional Interface!
    }
}
