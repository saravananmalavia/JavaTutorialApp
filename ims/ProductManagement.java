package ims.product;


import java.io.Serializable;
import java.util.*;
import ims.helper.*;
public class ProductManagement implements Serializable{
	Hashtable<Integer, Product> products;

	public ProductManagement(){
		products = IMSHelper.readData();
		if(products == null){
				products = new Hashtable<Integer,Product>();
		}
	}

	public boolean addProduct(Product product){
		boolean result = false;
		try{
			if(products.containsKey(product.getProductID())){
				Product productExist = (Product)products.get(product.getProductID());
				productExist.setQuantity(product.getQuantity() + productExist.getQuantity());
				products.put(product.getProductID(),productExist);
			}else{
				
				products.put(product.getProductID(),product);
			}
			
			IMSHelper.writeData(products);
			System.out.println("product added successfully");

			result = true;
		}
		catch(Exception e){
			result = false;
		}
		return result;
	
	}
	public boolean updateProduct(int productID , int quantity, String updateType){
		boolean result = false;
		try{

			Product product = (Product)products.get(productID);
			if(updateType.equals("sale")){
				int newQuantity = product.getQuantity() - quantity;
				if(newQuantity >= 0){
					product.setQuantity(product.getQuantity() - quantity);	
				}
				else{
					System.out.println("Not enough quantity in stock");
					System.out.println("Available quantity : " + product.getQuantity());
				}
				
			}else if(updateType.equals("purchase")){

				product.setQuantity(product.getQuantity() + quantity);
				System.out.println("Purchased quantity added in stock");
			}
			products.put(product.getProductID(),product);
			IMSHelper.writeData(products);
			result = true;
		}
		catch(Exception e){
			result = false;
		}
		return result;
	
	}

	public void viewProducts(){
		try{
				products = IMSHelper.readData();
	  			Enumeration<Integer> enumeration = products.keys();
 				while(enumeration.hasMoreElements()) {
	 				Integer key = enumeration.nextElement();
	   				System.out.println(products.get(key));
   				}
		}
		catch(Exception e){
			
		}

	}
	public void viewProduct(int productId){
		try{
				products = IMSHelper.readData();
				if(products.containsKey(productId)){
					Product product = (Product)products.get(productId);
					System.out.println(product);
				}else{
					System.out.println("No such product available");
				}
	  			
		}
		catch(Exception e){
			
		}

	}

	public static void main(String args[]){

		ProductManagement pm = new ProductManagement();

		Product product1 = new Product(101,"Lux",50,25);
		Product product2 = new Product(102,"Pears",40,35);
		Product product3 = new Product(103,"Rexsona",30,45);
		Product product4 = new Product(104,"Dove",20,55);

		// if(pm.addProduct(product1)){
		// 	System.out.println("Prodct added successfully");
		// 	pm.viewProducts();
		// }
			//pm.viewProduct(102);

		pm.updateProduct(101,25,"sale");
		pm.viewProduct(101);
		pm.updateProduct(101,125,"purchase");
		pm.viewProduct(101);
		pm.addProduct(product1);
		pm.addProduct(product2);
		pm.addProduct(product3);
		pm.addProduct(product4);
		pm.viewProducts();

	}


}
