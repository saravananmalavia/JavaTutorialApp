// Java program to demonstrate
// getting values as an Enumeration

import java.util.Enumeration;
import java.util.Hashtable;
import java.io.*;

public class EnumerationOnKeys {
	public static void main(String[] args)
	{
		// initialize an object of Hashtable
		Hashtable<Integer, String> ht
			= new Hashtable<Integer, String>();
		
		// insert key-value pairs into hash table
		ht.put(1, "Geeks");
		ht.put(2, "for");
		ht.put(3, "Geeks");

		
		
		// create an Enumeration object to read elements
		Enumeration e = ht.elements();

		// print elements of hashtable using enumeration
		while (e.hasMoreElements()) {
				
			// print the current element
			System.out.println(e.nextElement());
		}
	}
}
