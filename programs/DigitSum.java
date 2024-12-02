import java.util.*;
public class DigitSum {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int N,n,digitSum,lastDigit;
		System.out.println("Enter the value N");
		N = input.nextInt();
		n = N;
		digitSum = 0;

		do{
		    lastDigit =  n % 10;
			digitSum = digitSum + lastDigit ;
			n = n / 10;
		}while(n>0);
		System.out.println( "The digit sum of  " + N  + " is " + digitSum);
	}
}

//. 546  = 5+4+6 =15
// 6+4+5 = 15


