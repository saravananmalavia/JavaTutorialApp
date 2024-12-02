import java.util.*;

class Pattern4{
	public static void main(String args[]){

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scanner.nextInt();

		for(int i = 1; i <= n; i++){

			for(int j = 1 ; j <= i; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=n-1; i>=0; i--){
			for(int j=1 ; j<=i; j++){
				System.out.print(" *");
				
			}
			System.out.println();
		}

	}
}

/*
import java.util.*;
class PatternGen{
	public static void main (String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row= scanner.nextInt();
		generatePattern(row);
	
		}

	public static void generatePattern(int n){
		
		System.out.println("Printing pattern");

		for(int i=1; i<=n; i++){
			for(int j=1 ; j<=i; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=n-1; i>=0; i--){
			for(int j=1 ; j<=i; j++){
				System.out.print(" *");
				
			}
			
			
		
		
		System.out.println();
	    }
	    

	}	
}

*/