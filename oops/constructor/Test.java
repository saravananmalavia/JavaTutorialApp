class Test{
	public static void main(String args[]){
		int val;
	
		Product p1 = new Product();
		p1.printData();
		Product p2 = new Product(102,"Pears",45.0);
		p2.printData();
		Product p3 = new Product(103,"Dove",55.00);
		p3.printData();

		System.out.println("Product Id : " + p3.productId);

	}
}
class Product{
	int productId;
	String productName;
	double price;

	public Product(){
		productId = 101;
		productName = "Lux";
		price =23.5;
	}
	public Product(int productId,String productName,double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		//printData();
	}
	public void printData(){
		System.out.println("Product Id : " + this.productId);
		System.out.println("Product Name : " + this.productName);
		System.out.println("Price  : " + this.price);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
	}
}

