package pack1;
//import pack1.pack2.*;
//import pack1.*; // * will will import only all the public class
				// will not import packages
import pack1.pack2.*; 

public class PackDemo4{
	public static void main(String args[]){
		PackDemo1.display();
		PackDemo2.display();
		PackDemo3.display();
	}
	public static void display(){
		System.out.println("I am from PackDemo1");

	}
}
