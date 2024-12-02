
import java.util.Scanner;
class PerfectNumberGen{
	public static void main(String[] args) 
	{
		
		int start,end;

		start = 1;
		end = 1000;

		
		for(int n = start;n<=end;n++){
			if(checkPerfect(n)){
				System.out.println(n);
			}
			
		}

	}


	public static boolean checkPerfect(int n){

		int sum = 0; boolean result = false;
			for(int i = 1; i < n; i++) // 1 2 3 4 5
				{
					if(n % i == 0)
					{
						sum = sum + i;  // 0+1+2+3 = 6
					}
				}

				if(sum == n)
				{
					result = true;
				}

			return result;
				
	}

}

