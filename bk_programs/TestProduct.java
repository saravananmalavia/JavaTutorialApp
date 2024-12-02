package sales;

import java.util.*;

public class TestProduct {
	public static void main(String args[]) {
		Collection<Product> products = new HashSet<Product>();
		Product book0 = new Product("Book", 100.0, 10);
		Product book1 = new Product("Book", 100.0, 10);
		Product book2 = new Product("Book", 100.0, 10);
		Product book3 = new Product("Book", 100.0, 10);
		products.add(book0);
		products.add(book1);
		products.add(book2);
		products.add(book3);
		System.out.println(book0.equals(book1));
		System.out.println(book0.equals("book"));

		for (Product p : products) {
			System.out.println(p);
		}

	}
}
