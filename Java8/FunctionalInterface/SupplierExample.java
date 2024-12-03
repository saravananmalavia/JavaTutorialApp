import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to provide a random number
        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println("Random Number: " + randomNumber.get());
    }
}
