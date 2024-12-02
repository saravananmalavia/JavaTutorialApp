package casestudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.*;

public class InventoryDemo{

	public static void main(String args[]){

	try {
			FileInputStream is = new FileInputStream("ProductInventory.data");
			ObjectInputStream ois = new ObjectInputStream(is);

	

			Hashtable InventoryObj = (Hashtable) ois.readObject();



			Product productObj1 = (Product)InventoryObj.get(104);

			System.out.println(productObj1.getPrice());

			ois.close();
			is.close();



			productObj1.setQuantity(productObj1.getQuantity()-1);
			InventoryObj.put(104,productObj1);

			FileOutputStream fos = new FileOutputStream("ProductInventory.data");
			ObjectOutputStream oos = new ObjectOutputStream(fos);


			oos.writeObject(InventoryObj);

			Product productObj2 = (Product)InventoryObj.get(104);
			InventoryObj.put(104,productObj2);

			System.out.println(productObj2);


		
			// //get keys() from Hashtable and iterate
   //      	Enumeration<Integer> enumeration = InventoryObj.keys();
 
   //      // iterate using enumeration object
   //      while(enumeration.hasMoreElements()) {
 
   //          Integer key = enumeration.nextElement();
   //          System.out.println(InventoryObj.get(key));
   //      }
		
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
} 