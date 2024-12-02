import java.util.*;
public class NcrDemo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int n,r,ncr;

		System.out.println("Enter the value N");
		n = input.nextInt();
		System.out.println("Enter the value R");
		r = input.nextInt();

		ncr = findFact(n) / findFact(n-r) * findFact(r); 

		System.out.println("N   = " + n);
		System.out.println("r   = " + r);
		System.out.println("NCR = " + ncr);

		}
		public static int findFact(int n){
			int fact = 1;
			for(int i=1;i<=n;i++){
				fact = fact * i;
			}
			//System.out.println(fact);
			return fact;
		}

	}