package sales;

import java.util.*;

public class TestProduct {
	public static void main(String args[]) {
		// Collection<Product> products = new HashSet<Product>();
		MyLinkedList products = new MyLinkedList();
		Product book0 = new Product("Book", 100.0, 10);
		Product book1 = new Product("Book", 200.0, 10);
		Product book2 = new Product("Book", 100.0, 110);
		Product book3 = new Product("Book", 100.0, 10);
		products.add(book0);

		products.add(book1);
		products.add(book2);
		products.add(book3);

		for (int i = 0; i < products.getSize(); i++) {
			System.out.println(products.get(i));
		}

//		System.out.println(book0.equals(book1));
//		System.out.println(book0.equals("book"));

//		for (Product p : products) {
//			System.out.println(p);
//		}

	}
}
