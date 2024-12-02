import java.util.*;
class ArrayListDemo1{
	public static void main(String args[]){  
		
		ArrayList list = new ArrayList();
		list.add("Saravanan");
		list.add("Concept");
		list.add("Solutions");
		

		Iterator itr = list.iterator(); 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  

	}
}

