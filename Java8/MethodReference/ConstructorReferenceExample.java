import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceExample {

    static class Book {
        String title;

        // Constructor
        public Book(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Book: " + title;
        }
    }

    public static void main(String[] args) {
        List<String> bookTitles = Arrays.asList("Java Programming", "Effective Java", "Clean Code");

        // Using constructor reference to create new Book objects
        List<Book> books = bookTitles.stream()
                                     .map(Book::new)  // Constructor reference
                                     .collect(Collectors.toList());

        books.forEach(System.out::println);
    }
}


/*

4. Constructor Reference
In case we want to reference a constructor 
(to create new objects), we can use a constructor reference. 
Let’s consider a Book class where we’ll create instances using constructor references.


Explanation:

Book::new is a reference to the Book constructor. 
It creates a new Book object using each title from the list.
The constructor reference makes the code cleaner compared 
to using a lambda expression like title -> new Book(title).


*/

