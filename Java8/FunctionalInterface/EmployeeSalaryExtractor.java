import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSalaryExtractor {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 70000),
            new Employee("Bob", 80000),
            new Employee("Charlie", 65000)
        );

        // Function to extract salary
        Function<Employee, Double> getSalary = employee -> employee.salary;

        // Extracting salaries
        List<Double> salaries = employees.stream()
                                         .map(getSalary)
                                         .collect(Collectors.toList());

        System.out.println(salaries); // Output: [70000.0, 80000.0, 65000.0]
    }
}
