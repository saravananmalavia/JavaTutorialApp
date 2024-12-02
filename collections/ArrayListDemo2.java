// collection can store any type of objects

import java.util.*;
class ArrayListDemo2{
	public static void main(String args[]){  
		ArrayList list = new ArrayList();
		list.add("Saravanan");
		list.add("Concept");
		list.add("Solutions");
		Integer i = new Integer(100);
		list.add(i);
		list.add(200);
		list.add(new Integer(300)); 
		list.add(100.10);
		list.add(true);

		Iterator itr = list.iterator(); 
	
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	
	}
}

