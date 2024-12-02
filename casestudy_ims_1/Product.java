package casestudy;
import java.io.Serializable;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;

public class Product implements Serializable {
	public static void main(String args[]) throws Exception{
		// FileOutputStream fos = new FileOutputStream("product.txt");
		// ObjectOutputStream oos = new ObjectOutputStream(fos);
		// oos.writeObject(product);


		Product product1 = new Product(101,"Lux",50,25);
		Product product2 = new Product(102,"Pears",40,35);
		Product product3 = new Product(103,"Rexsona",30,45);
		Product product4 = new Product(104,"Dove",20,55);

		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		System.out.println(product4);

}

	public int productID;
	public String productName;
	public int quantity;
	public int price;

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
		output += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		return output;

	}







}