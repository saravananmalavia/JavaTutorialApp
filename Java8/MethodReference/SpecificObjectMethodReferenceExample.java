import java.util.Arrays;
import java.util.List;

public class SpecificObjectMethodReferenceExample {

    static class Printer {
        public void printMessage(String message) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        List<String> messages = Arrays.asList("Hello", "World", "Java");

        // Using method reference on a specific object (printer)
        messages.forEach(printer::printMessage);  // Output: Hello World Java
    }
}

/*

3. Instance Method Reference (Using a Specific Object)
If we have a predefined object and want to refer to its method, we can use an instance method reference with a specific object.

Example:

Explanation:

printer::printMessage is a reference to the printMessage method of the printer object.
We use this method reference in the forEach operation to print each message.


*/
