/*
    What is Supplier<T>?
The Supplier<T> interface is part of the java.util.function package, 
and it represents a function that supplies a value without taking any input.

Functional method :

T get();

Generic Type: T represents the type of the value that the Supplier will supply (the output).
No Input: Unlike other functional interfaces like Function<T, R>, Supplier<T> 
does not take any input but returns a value of type T.


*/

import java.util.function.Supplier;

class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car Model: " + model + ", Price: $" + price;
    }
}

public class CarFactory {
    public static void main(String[] args) {
        // Supplier for creating new Car objects
        Supplier<Car> carSupplier = () -> new Car("Tesla", 49999.99);

        // Create cars on demand
        Car car1 = carSupplier.get();
        Car car2 = carSupplier.get();

        System.out.println(car1);
        System.out.println(car2);
    }
}
