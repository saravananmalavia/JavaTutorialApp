package casestudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.*;

public class Inventory{

	public static void main(String args[]){

	try {
			FileOutputStream fos = new FileOutputStream("ProductInventory.data");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Hashtable<Integer, Product> inventory = 
						new Hashtable<Integer, Product>();

		Product product1 = new Product(101,"Lux",50,25);
		Product product2 = new Product(102,"Pears",40,35);
		Product product3 = new Product(103,"Rexsona",30,45);
		Product product4 = new Product(104,"Dove",20,55);

		inventory.put(101,product1);
		inventory.put(102,product2);
		inventory.put(103,product3);
		inventory.put(104,product4);

		// write object to file
			oos.writeObject(inventory);
			System.out.println("Done");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	
} 