import java.util.*;
public class MethodDemo {
	public static void main(String args[]){
		printGreeting();
		printGreeting();
		displayGreeting("Saravanan");
		displayGreeting("Abiseik");
		displayGreeting("123");


	}
	// public static -acess modifiers | void - return typpe | methodName()
	public static void printGreeting(){
		System.out.println("Welcome ");

	}
	public static void displayGreeting(String name){
		System.out.println("Welcome " + name);
	}
}
