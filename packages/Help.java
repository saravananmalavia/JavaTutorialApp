package helper;

import java.util.Scanner;

public class Help{
	public static int getI(){
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		return value;
	}
	public static void main(String args[]){
		System.out.println("Enter a integer value");
		int v = getI();

		System.out.println(v);
		
		System.out.println(Utility.add(100,220));
	}

}