import java.util.*;
class CollectionDemo{


	public static void main(String args[]){


		ArrayList list = new ArrayList();
		//ArrayList<Book> list = new ArrayList<Book>();
			list.add(new Product(101,"apple", 150.50));
			list.add(new Book(202,"Java", "ABC publications"));
			list.add(new Product(102,"orange", 150.50));
			list.add(new Student(301,"Athira", "CSE"));



		for(Object obj : list){
			System.out.println(obj);
		}

		Product products[] = { 
								new Product(101,"apple", 150.50),
								new Product(102,"orange", 140.50),
								new Product(103,"graphs", 130.50)

							 };

		Book books[] = { 
								new Book(201,"PHP", "XYZ publications"),
								new Book(202,"Java", "ABC publications"),
								new Book(203,"Android", "ZYX publications")

						 };
		Student students[] = { 
								new Student(301,"Athira", "CSE"),
								new Student(302,"Anjana", "ECE"),
								new Student(303,"Ajith", "EEE")

						 };


		// for(Product product : products){
		// 	System.out.println(product);

		// 	//String productDetails = product + "****************";
		// 	//System.out.println(productDetails);
		// }


		// for(Book book : books){
		// 	System.out.println(book);
		// }

		// for(Student student : students){
		// 	System.out.println(student);
		// }


		// Object class 

	}
	

}
class Product extends Object{
	int id;
	String name;
	double price;	

	public Product(){

	}public Product(int id, String name, double price){

		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString(){
		String result;
		result =  "Product Id : " + id + "\n";
		result += "Product Name : " + name + "\n";
		result += "Product Price : " + price + "\n";

		return result;

	}


}

class Book{
	int boookId;
	String bookName;
	String publications;

	public Book(){}
	public Book(int id, String name, String publications){
		boookId = id;
		bookName = name;
		this.publications = publications;
	}

	public String toString(){
		String result;
		result =  "Book Id : " + boookId + "\n";
		result += "Book Name : " + bookName + "\n";
		result += "Book publications : " + publications + "\n";

		return result;

	}
	
}

class Student{
	int studentId;
	String name;
	String department;

	public Student(){}
	public Student(int id, String name, String department){

		studentId = id;
		this.name = name;
		this.department = department;

	}






	
}