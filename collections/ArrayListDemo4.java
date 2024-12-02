// generic type collections
import java.util.*;
class ArrayListDemo4{
	public static void main(String args[]){
		// list can hold only time objects  
		ArrayList<Time> list = new ArrayList<Time>();

		list.add(new Time(10,45,15));
		list.add(new Time(11,35,15));
		list.add(new Time(12,25,15));
		list.add(new Time(13,15,15));
		list.add(new Time(14, 5,15));
		//list.add("Saravanan"); accept only Time object

		Iterator itr = list.iterator(); 
		System.out.println(itr.hasNext()); 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
			System.out.println("*********");  
		}  
		

	}
}
