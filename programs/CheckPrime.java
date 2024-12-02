import java.util.*;
public class CheckPrime {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int n;
		//System.out.println("Enter the value N");
		//n = input.nextInt();

		n  = (int)(Math.random()*(200-100+1)+100); 


		boolean flag = true;

		boolean alternative = true;

		for(int i=2; i <= Math.sqrt(n);i++){

			if( n % i == 0){
				flag = false;
				break;
			}

		}

		if(flag == false){
				System.out.println("The given number " + n + " is not a Prime");
		}else{

			if(alternative == true){
				System.out.println("The given number " + n + " is Prime");
				alternative = ! alternative;
			}


			
		}

	}
}