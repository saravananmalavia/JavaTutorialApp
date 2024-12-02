package ims.helper;

import java.util.*;
public class Helper{
	public static Scanner in; 

// to initialize static data members
// static block
// invoked only once before creating the first object
	static{
		in = new Scanner(System.in);
	}

	public static int getI(){
		int result = 0;
		boolean isOK = false; 

		do{
			try{
				result = in.nextInt();
				isOK = true;
			}
			catch(Exception e){
				System.out.println("Enter a valid integer");
				in.next();
			}
		}while(!isOK);
		
		return result ;

	}
	public static String getS(){
		String result = null;
		
			try{
				result = in.next();
			
			}
			catch(Exception e){
				
			}
		return result ;

	}
	public static double getD(){
			double result = 0.0;
			boolean isOK = false; 

			do{
				try{
					result = in.nextDouble();
					isOK = true;
				}
				catch(Exception e){
					System.out.println("Enter a valid double");
					in.next();
				}
			}while(!isOK);
			
			return result ;

		}




	public static void main(String args[]){
		System.out.println(getI());
		System.out.println(getD());

	}
}