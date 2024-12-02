import java.util.*;
class HashTableDemo1{

 public static void main(String args[]){  
          Hashtable<Integer,Product> hm = new Hashtable<Integer,Product>();  
          
          hm.put(101,new Product("Rexsona",101,25.50));  
          hm.put(102,new Product("Lux",102,35.50));  
          hm.put(103,new Product("Hamam",103,45.50));  
          hm.put(104,new Product("Pears",104,55.50));  
          
          for(Map.Entry m : hm.entrySet()){ 
           
            System.out.println(m.getKey() + " " + m.getValue());  
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