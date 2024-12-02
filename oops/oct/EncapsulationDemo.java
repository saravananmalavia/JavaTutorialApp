class EncapsulationDemo{
	public static void main(String args[]){

		Product product1 = new Product(101, "Dove", 43.50);
		Product product2 = new Product(102, "Lux", 23.50);
		Product product3 = new Product(103, "Rexsona", 33.50);
		Product product4 = new Product(104, "Cinthol", 35.50);
		Product product5 = new Product(105, "Medimix", 53.50);

		product1.display();
		//product1.name = "Dov Inter";
		product1.setName("Dov Inter");
		product1.display();

//		System.out.println("Product  Name  : " + product1.name);
		System.out.println("Product  Name  : " + product1.getName());
		// product2.display();
		// product3.display();
		// product4.display();
		// product5.display();

	}
}


class Product{
	int id;
	private String name;
	double price;

	public  Product(){

	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public  Product(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void display(){
		System.out.println("Product  Id    : " + id);
		System.out.println("Product  Name  : " + name);
		System.out.println("Product  Price : " + price);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
}