import java.util.*;

class VectorExample1 {
	public static void main(String args[]){

		Vector vector1 = new Vector();

		vector1.add(10);
		vector1.add(20);
		vector1.add("KELTRON");
		vector1.add(100.20);
		vector1.add('y');
		vector1.add(true);
		Product product1 = new Product("Rexsona",102,25.50);
		vector1.add(new Product("Lux",101,35.50));
		vector1.add(product1);

		System.out.println(product1);

		String sample = "RESULT : " + product1;

		System.out.println(sample);

		System.out.println(vector1.get(6));

		 for (int i = 0; i < vector1.size(); i++)
             System.out.println(vector1.get(i)); 	
        
        for(Object obj : vector1){
        	System.out.println(obj);
        }
		

        //Traversing collection through Iterator  
		Iterator itr = vector1.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
}
class Product{
	String name;
	int id;
	double price;

	public Product(String name,int id, double p){
		this.name = name;
		this.id = id;
		price = p;
	}	
	// toString() - Object class method 
	
	public String toString(){
			
			String output = "[" + id + "," + name + "," + price + "]";
				//[101,Lux,35.5]
			return output;
	}



}
