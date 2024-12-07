public class WithLambda {
    public static void main(String[] args) {
       /* Runnable task = () -> System.out.println("Task is running!");
        Thread thread = new Thread(task);
        thread.start();

        */

       /*  Calculator addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.operate(5, 3)); // Output: Sum: 8

        Calculator sub = (a, b) -> a - b;
        System.out.println("Sub: " + sub.operate(5, 3)); // Output: Sum: 8*/

       Calculator sub = a -> a + 10;

      System.out.println("Sub: " + sub.process(5));



    }
}

@FunctionalInterface
interface Calculator {
   // int operate(int a, int b);
    int process(int a);
}