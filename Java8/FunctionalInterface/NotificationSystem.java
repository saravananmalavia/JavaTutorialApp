/*

    Built-in Functional Interfaces in java.util.function Package:
    Predicate<T>: Represents a boolean-valued function.
    Consumer<T>: Represents an operation that takes a single input and returns no result.
    Function<T, R>: Represents a function that takes one input and produces a result.
    Supplier<T>: Represents a function that supplies a value.


    1. What is a Consumer?
    Consumer<T> is a functional interface from the java.util.function package.
    It accepts an input of type T but does not return a result.
    
    Consumer<T>: Represents an operation that takes a single input and returns no result.

    void accept(T t);
    
    It is used when we want to perform an action on an object, 
    such as logging, modifying, or sending notifications.


*/


import java.util.*;


import java.util.function.Consumer;

class Customer {
    String name;
    String email;
    double balance;

    public Customer(String name, String email, double balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer("Alice", "alice@example.com", 150.00),
            new Customer("Bob", "bob@example.com", 50.00),
            new Customer("Charlie", "charlie@example.com", 20.00)
        );

        // Consumer for sending low balance warning
        Consumer<Customer> sendNotification = customer -> {
            if (customer.balance < 100) {
                System.out.println("Sending email to " + customer.email + ": "
                        + "Your balance is low: $" + customer.balance);
            }
        };

        // Notify customers with low balance
        customers.forEach(sendNotification);
    }
}
