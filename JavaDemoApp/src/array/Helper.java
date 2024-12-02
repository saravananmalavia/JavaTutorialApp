package keltron.util;
import java.util.*;
public class Helper{

	static Scanner scanner = new Scanner(System.in);

	public static double getArrayAverage(int values[]){

		int sum = 0; double avg;
		for(int i=0;i<values.length;i++){
			sum += values[i];
		}
		avg = sum/values.length;

		return avg;
	}

	public static int getI(){
		int val=0;
		boolean corectValue = false;


		do{

			try{
				val = scanner.nextInt();
				corectValue = true;
				
			}
			catch(Exception e){
				getS(); 
				System.out.println("enter a valid integer");
			}



		}while(corectValue != true);

		


		
		return val;
	}

	public static double getD(){
		double val = scanner.nextDouble();
		return val;
	}

	public static String getS(){
		String val = scanner.next();
		return val;
	}

	public static void sop(String message){

		System.out.println(message);

	}


	public static void main(String args[])
       {
       	int i  = getI();
       	System.out.println(i);

       }


}