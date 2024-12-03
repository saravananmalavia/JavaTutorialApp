/*

    Built-in Functional Interfaces in java.util.function Package:
    Predicate<T>: Represents a boolean-valued function.
    Consumer<T>: Represents an operation that takes a single input and returns no result.
    Function<T, R>: Represents a function that takes one input and produces a result.
    Supplier<T>: Represents a function that supplies a value.


    1. What is Predicate?
Predicate<T> is a functional interface from the java.util.function package.
It represents a single-argument function that returns a boolean value.
It is often used to define conditions or filters.

Functional Method of Predicate:

boolean test(T t);
This method takes an input (T t) and returns a boolean value (true or false).


*/
import java.util.*;
import java.util.function.Predicate;

class Product {
    String name;
    double price;
    boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

public class ProductFilter {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1000, true),
            new Product("Smartphone", 700, false),
            new Product("Headphones", 50, true),
            new Product("Tablet", 300, true)
        );

        // Predicate for filtering in-stock products
        Predicate<Product> isInStock = product -> product.inStock;

        // Predicate for filtering products under $500
        Predicate<Product> isAffordable = product -> product.price < 500;

        // Display products that are in stock
        System.out.println("In-stock products:");
        products.stream().filter(isInStock).forEach(System.out::println);

        // Display affordable products
        System.out.println("\nAffordable products:");
        products.stream().filter(isAffordable).forEach(System.out::println);
    }
}

/*

1. What is Predicate?
Predicate<T> is a functional interface from the java.util.function package.
It represents a single-argument function that returns a boolean value.
It is often used to define conditions or filters.

Functional Method of Predicate:

boolean test(T t);
This method takes an input (T t) and returns a boolean value (true or false).

2. Breaking Down the Lambda Expression

Lambda Expressions in Java

Lambda expressions are a concise way to represent 
functional interfaces (interfaces with a single abstract method) in Java. 
They allow you to write small, anonymous functions without the boilerplate code 
of creating classes or methods.

Syntax of Lambda Expressions

(parameters) -> expression
// OR
(parameters) -> { statements }

(parameters): Input arguments to the lambda.
->: Lambda operator.
expression or { statements }: The body of the lambda function, defining its behavior.


Predicate<Product> isInStock = product -> product.inStock;

The lambda is equivalent to:

@Override
public boolean test(Product product) {
    return product.inStock;
}


Predicate<Product>: Indicates that this Predicate will operate on objects of type Product.

isInStock: The name of the Predicate (a descriptive name that explains the condition it checks).

Lambda Expression (product -> product.inStock):

product: Represents the input argument to the predicate. It is a Product object in this case.
product.inStock: This is the condition being evaluated. It checks the value of the inStock field of the Product object, which is expected to be a boolean.

The statement:

```java
products.stream().filter(isInStock).forEach(System.out::println);
```

is a concise way to **process a collection** (list of products) using Java's **Stream API**. Let’s break it down step by step:

---

### **1. What is `Stream`?**

- A `Stream` is a sequence of elements that can be processed (filtered, mapped, or reduced) in a **functional style**.
- Streams allow for declarative coding by expressing *what to do* instead of *how to do it*.

---

### **2. Breaking Down the Code**

#### **Step 1: `products.stream()`**
- The `stream()` method is called on the `products` list.
- It converts the list into a **Stream** of `Product` objects.
  
  **Example**:
  If `products` contains:
  ```java
  List<Product> products = Arrays.asList(
      new Product("Laptop", 1000, true),
      new Product("Phone", 700, false),
      new Product("Tablet", 300, true)
  );
  ```
  Then `products.stream()` creates a stream: `Laptop`, `Phone`, `Tablet`.

---

#### **Step 2: `.filter(isInStock)`**
- The `filter()` method is an **intermediate operation** in the Stream API.
- It applies the `isInStock` predicate to each element in the stream and **retains only those elements** for which the predicate returns `true`.

  - **`isInStock`**: 
    ```java
    Predicate<Product> isInStock = product -> product.inStock;
    ```
    It checks if the product is in stock (i.e., `product.inStock` is `true`).

  - After filtering, only the products with `inStock = true` are passed to the next step.

  **Example Output**:
  - From the `products` list, `filter(isInStock)` keeps:
    - `Laptop` (true)
    - `Tablet` (true)
    - Excludes `Phone` (false).

---

#### **Step 3: `.forEach(System.out::println)`**
- The `forEach()` method is a **terminal operation** in the Stream API.
- It **iterates** over each element in the filtered stream and performs the specified action.
  
  - **`System.out::println`**: This is a **method reference**. It is shorthand for:
    ```java
    product -> System.out.println(product);
    ```
    It prints each product to the console.

  **Example Output**:
  ```
  Product{name='Laptop', price=1000.0, inStock=true}
  Product{name='Tablet', price=300.0, inStock=true}
  ```

---

### **3. Entire Flow**
Here’s how the operation works step-by-step:
1. **Convert the list to a Stream**:
   - `products.stream()` creates a stream of products: `Laptop`, `Phone`, `Tablet`.
2. **Filter the stream**:
   - `filter(isInStock)` keeps only products with `inStock = true`.
   - The stream now contains: `Laptop`, `Tablet`.
3. **Perform an action on each element**:
   - `forEach(System.out::println)` prints each filtered product.

---

### **4. Why Use This Approach?**
- **Conciseness**: The code expresses the entire operation in one line without explicit loops.
- **Readability**: It is easier to understand the intent (filter and print in-stock products).
- **Efficiency**: Streams can optimize operations internally (e.g., lazy evaluation).

---

### **5. Equivalent Code Without Streams**
To understand what happens internally, here’s the equivalent code using traditional loops:

```java
for (Product product : products) {
    if (product.inStock) { // Filter condition
        System.out.println(product); // Print the product
    }
}
```

This is more verbose and less expressive compared to the Stream-based approach.

---

### **Summary**
The statement `products.stream().filter(isInStock).forEach(System.out::println);`:
1. Creates a stream from the `products` list.
2. Filters the products to include only those that are **in stock**.
3. Prints each filtered product to the console.

It combines **functional programming** and **declarative style** to write clean, concise, and expressive code.






*/
