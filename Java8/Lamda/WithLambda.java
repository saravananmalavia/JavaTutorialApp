public class WithLambda {
    public static void main(String[] args) {
       /* Runnable task = () -> System.out.println("Task is running!");
        Thread thread = new Thread(task);
        thread.start();

        */

         Calculator addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.operate(5, 3)); // Output: Sum: 8

    }
}

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}