import java.util.*;
public class Factorial {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int n,fact;
		System.out.println("Enter the value N");
		n = input.nextInt();
		fact = 1;

		for(int i=1;i<=n;i++){
			fact = fact * i;
		}

		System.out.println("Facorial of " + n + " is " + fact);
	}
}

//Ncr = n! /(n-r)! * r!

