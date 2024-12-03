/*

Lambda Expressions in Java
Lambda expressions are a concise way to represent functional interfaces (interfaces with a single abstract method) in Java. They allow you to write small, anonymous functions without the boilerplate code of creating classes or methods.

Syntax

(parameters) -> expression
// OR
(parameters) -> { statements }

(parameters): Input arguments to the lambda.
->: Lambda operator.
expression or { statements }: The body of the lambda function, defining its behavior.


Key Points
Lambda expressions are used to implement functional interfaces.
They make code more concise and readable.
They can be passed as arguments to methods or stored in variables.


*/

import java.util.function.Predicate;

public class WithoutLambda {
    public static void main(String[] args) {
    	/*
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running!");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        */

    	/*
        Calculator addition = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Sum: " + addition.operate(5, 3)); // Output: Sum: 8

        */

        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };

        System.out.println(isEven.test(4)); // Output: true
    }


}

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}
