import java.util.*;
class Ncr
{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n,r,ncr;

		System.out.println("Enter the value of n");
		n = scanner.nextInt();

		System.out.println("Enter the value of r");
		r = scanner.nextInt();

		ncr = findFactorial(n)/(findFactorial(r)* findFactorial(n-r));

		System.out.println("n : " + n);
		System.out.println("r : " + r);
		System.out.println("ncr : " + ncr);


	}

	public static int findFactorial(int f){
		int fact = 1;
		for(int i = 2 ;i <=f ; i++){
			fact *= i; // fact = fact * i;	
		}

		return fact;
	}


}