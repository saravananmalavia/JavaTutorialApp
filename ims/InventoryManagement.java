package ims;


import ims.helper.Helper;
import ims.product.Product;
import ims.product.ProductManagement;

public class InventoryManagement{
	public static void main(String args[]){
		int option,productID,quantity,price;
		String productName;

		ProductManagement pm = new ProductManagement();
			System.out.println("**************************");
			System.out.println("*  Inventory Management  *");
			System.out.println("**************************");

		do{

			System.out.println("*   1. Add New Product   *");
			System.out.println("*   2. Sale  Product     *");
			System.out.println("*   3. Purchase Product  *");
			System.out.println("*   4. View Product      *");
			System.out.println("*   5. View All Product  *");
			System.out.println("*   6. Exit              *");
			System.out.println("**************************");
			System.out.println("Enter your choice (1-6)   ");
			option = Helper.getI();
			switch(option){
				case 1:
						System.out.println("Add New Product");
						System.out.println("**************************");
						System.out.print("Enter the Product ID :");
						productID = Helper.getI();
						System.out.print("Enter the Product Name :");
						productName = Helper.getS();
						System.out.print("Enter the quantity:");
						quantity = Helper.getI();
						System.out.print("Enter the price:");
						price = Helper.getI();
						Product product = new Product(productID,productName,quantity,price);
						pm.addProduct(product);
						System.out.println("**************************");

						break;
				case 2:
						System.out.println("Sale Product ");
						System.out.println("**************************");
						System.out.print("Enter the Product ID :");
						productID = Helper.getI();
						System.out.print("Enter the quantity:");
						quantity = Helper.getI();
						pm.updateProduct(productID,quantity,"sale");
						pm.viewProduct(productID);
						System.out.println("**************************");

						break;
				case 3:
						System.out.println("Purchase Product ");
						System.out.println("**************************");
						System.out.print("Enter the Product ID :");
						productID = Helper.getI();
						System.out.print("Enter the quantity:");
						quantity = Helper.getI();
						pm.updateProduct(productID,quantity,"purchase");
						pm.viewProduct(productID);
						System.out.println("**************************");
						break;
				case 4:
						System.out.println("View Product ");
						System.out.println("**************************");
						System.out.print("Enter the Product ID :");
						productID = Helper.getI();
						pm.viewProduct(productID);
						System.out.println("**************************");
						break;
				case 5:
						System.out.println("View All Product ");
						System.out.println("**************************");
						pm.viewProducts();
						System.out.println("**************************");
						break;
				case 6:
						System.out.println("Thank you, visit again !");
						System.out.println("**************************");
						System.exit(0);
						break;
				default :
						System.out.println("Kindly enter a right choice ");
						System.out.println("****************************");
						break;
			}
		}while(option != 6);
	}
}