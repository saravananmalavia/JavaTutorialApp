import java.util.*;  
class ArrayListDemo{  
	public static void main(String args[]){  
		ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
		ArrayList list1 = new ArrayList();

		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		//list.add(101);
		//list.add(102); 

		list1.add("Saravana");
		list1.add("Anjith");
		list1.add(101);

		//Integer

		//Traversing list through Iterator  
		Iterator itr = list1.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
} 