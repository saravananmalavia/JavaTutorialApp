package ims.product;

import java.io.Serializable;
public class Product implements Serializable{
	private int productID;
	private String productName;
	private int quantity;
	private int price;

	public Product(){

	}
	public Product(int id,String name,int quantity,int price){
		this.productID = id;
		this.productName = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString(){
		String output ="";

		output += "Product Id : " + productID + "\n";
		output += "Product Name : " + productName + "\n";
		output += "Product price : " + price + "\n";
		output += "Product quantity : " + quantity + "\n";
		output += "~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		return output;

	}

}