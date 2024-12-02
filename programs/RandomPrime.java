import java.util.*;
public class RandomPrime {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int n;
		//System.out.println("Enter the value N");
		//n = input.nextInt();

		boolean result = false;

		do{

			//n  = (int)(Math.random()*(200-100+1)+100); 
			n  = (int)(Math.random()*100); 
			result = checkPrime(n);	
		} while(result == false);

		System.out.println("Prime : " + n);
		
		}


		static boolean checkPrime(int num) {
        int i, flag = 0;

        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

}