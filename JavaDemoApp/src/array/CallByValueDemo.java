
class CallByValueDemo{

	public static void main(String args[]){

		int number1 = 20;

		int num[] = new int[1];
		num[0] =  20;

		String name = new String("Shankar");

		Product p = new Product();
		p.id = 10;

		System.out.println("Call By value"); // premitive data types

		System.out.println("number1 before passing to changeValue Method " + number1);
		
		changeValue(number1); // it passess the copy of the value
		
		System.out.println("number1 after passing to changeValue Method " + number1);
	
		 System.out.println("Call By reference");

		 System.out.println("num[] before passing to changeArrayValue Method " + num[0]);
		
		 changeArrayValue(num); // it passess the address of the array
		
		 System.out.println("num[] after passing to changeArrayValue Method " + num[0]);

		 System.out.println("name before passing to changeStringValue Method " + name);
		
		 changeStringValue(name); // it passess the address of the object
		
		 System.out.println("name after passing to changeStringValue Method " + name);


		 System.out.println("product id  before passing to changeProduct Method " + p.id);
		
		 changeProduct(p); // it passess the address of the object
		
		 System.out.println("product id  after passing to changeProduct Method " + p.id);



	}

	public static void changeValue(int val1){
		val1 +=10;
		System.out.println("val1 with in changeValue Method " + val1);
	}

	public static void changeArrayValue(int val1[]){
		val1[0] +=10;
		System.out.println("val1[0] with in changeArrayValue Method " + val1[0]);
	}


	public static void changeStringValue(String message){
		message = message + " welcome ";
		System.out.println("message with in changeStringValue Method " + message);
	}

	public static void changeProduct(Product product){
		product.id = 300;
		System.out.println("Product id with in changeProduct " + product.id);
	}

}

class Product{
	int id;
}



