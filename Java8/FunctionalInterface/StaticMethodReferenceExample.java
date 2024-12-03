import java.util.Arrays;
import java.util.List;

/*
    1. Static Method Reference
    Let’s start with a static method reference. 
    Assume we have a class MathOperations with a static method multiply 
    that we want to use in a stream operation.

    Explanation:

    StaticMethodReferenceExample::multiply is a 
    method reference that refers to the static multiply method.
    Instead of writing a lambda expression, 
    we simply use the method reference to simplify the code.

Example:
*/

public class StaticMethodReferenceExample {
    // Static method
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        List<int[]> numberPairs = Arrays.asList(
                new int[]{1, 2},
                new int[]{3, 4},
                new int[]{5, 6}
        );

        // Using method reference to refer to the static method multiply
        numberPairs.stream()
                .map(pair -> StaticMethodReferenceExample.multiply(pair[0], pair[1]))  // Using method reference here
                .forEach(System.out::println);  // Output: 2 12 30
    }
}

/*
What is a Method Reference?
In Java, method references are a shorthand notation for calling a method. They provide a clear and concise way to refer to methods directly using the class or object. A method reference can be used to call a method instead of using a lambda expression, making the code cleaner and more readable.

Types of Method References:
Reference to a Static Method:

ClassName::staticMethodName
Reference to an Instance Method of an Object:

instance::instanceMethodName
Reference to an Instance Method of a Particular Class:

ClassName::instanceMethodName
Reference to a Constructor:

ClassName::new

*/
