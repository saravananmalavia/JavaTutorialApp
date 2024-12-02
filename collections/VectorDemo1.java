import java.util.*;

class VectorDemo1{
	
	public static void main(String args[]){

		Vector v1 = new Vector();

		
		Vector v2 = new Vector();
		v2.add("I am from v2");
		v2.add("I am from v2");
		v2.add("I am from v2");
		
		v1.add("Keltron");
		v1.add("Welcome");
		v1.add("Welcome");
		v1.add("Welcome");
		v1.add(10); // auto boxing 
		v1.add(new Integer(10));
		v1.add(false); // auto boxing 
		v1.add(new Product(101));

		v1.remove("Keltron");

		v1.remove("Welcome");

		 v1.addAll(v2);
		 v1.removeAll(v2);
		// v1.retainAll(v2);
		 //v1.clear();

		 System.out.println(v1.contains("Welcome"));
		 System.out.println(v1.contains("Keltron"));
		 System.out.println(v1.containsAll(v2));

		Object obj[] = v1.toArray();

		// for (int i = 0; i < v1.size(); i++)
  //           System.out.println(v1.get(i) + " ");

        for(Object o : obj){
        	System.out.println(o);
        }


		//Traversing collection through Iterator  
		// Iterator itr = v1.iterator();  
		// while(itr.hasNext()){  
		// 	System.out.println(itr.next());  
		// }  

	}
}

class Product{
	int id;
	public Product(int id){
		this.id = id;
	}
	public String toString(){
		return "Product id : "+ id;
	}
}


/*
int val[]
String val[]
Student students[]
Produc products[]



// array can hold only simillar type of values
// collections can hold any type of objects

// array size is fixed
// collections can grow 


duplicates
order
serialized
synchronized



*/
