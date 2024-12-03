import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceExample {

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println("Hello, " + name);
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice"),
                new Person("Bob"),
                new Person("Charlie")
        );

        // Using method reference to call sayHello() on each Person object
        people.forEach(Person::sayHello);  // Output: Hello, Alice  Hello, Bob  Hello, Charlie
    }
}

/*

2. Instance Method Reference (Using an Object Instance)
Now let's use an instance method reference. We’ll assume we have a Person class with an instance method sayHello() that prints a greeting. We’ll use this method in a stream operation.

Example:

Explanation:

Person::sayHello is an instance method reference that calls the sayHello method of each Person object in the list.
Instead of using a lambda expression like p -> p.sayHello(), we use the method reference for cleaner code.


*/