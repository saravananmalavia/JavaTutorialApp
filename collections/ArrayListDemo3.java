// collection can also store user defined class objects
import java.util.*;
class ArrayListDemo3{
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

		Time time1 = new Time(10,45,15);
		list.add(time1);

		Iterator itr = list.iterator(); 
		System.out.println(itr.hasNext()); 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		// System.out.println(itr.hasNext());

		System.out.println(time1);

	}
}

class Time{

	int hour,min,sec;

	public Time(){

	}
	public Time(int hour,int min,int sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public  String toString(){
		String output;

		output = "Hour :" + this.hour + "\nMin  :" + this.min + "\nSec  :" + this.sec ;
		return output; 
	}






}