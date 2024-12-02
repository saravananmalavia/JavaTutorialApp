/*
What is a Perfect Number in Java?
In simple terms, perfect number is equal to the sum of its proper divisors excluding the number itself. Let me cite an example to help you understand it better. Let’s consider a few examples:
Example1: 6
Positive factors are; 1,2,3,6
Here, the sum of all the factors excluding the number itself is equal to 6.
Example2: 28
Positive factors are; 1,2,4,7,14,28
Again the sum of all the factors excluding the number itself comes out to be 28.

*/
import java.util.Scanner;
class PerfectNumber{
	public static void main(String[] args) 
	{
		int n, sum = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer:");
		n = s.nextInt(); // 6

		for(int i = 1; i < n; i++) // 1 2 3 4 5
		{
			if(n % i == 0)
			{
				sum = sum + i;  // 0+1+2+3 = 6
			}
		}

		if(sum == n)
		{
			System.out.println("The number is Perfect");
		}
		else
		{
			System.out.println("The number is not Perfect");
		}    
	}
}