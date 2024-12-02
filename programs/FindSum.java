import java.util.*;
public class FindSum {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int value1,value2,sum;

		System.out.println("Enter the value value1");
		value1 = input.nextInt();

		System.out.println("Enter the value value2");
		value2 = input.nextInt();

		//sum = value1 + value2 ;

		sum = findSum(value1,value2);
		
		findSum(value1,value2);
		System.out.println( "value1 : " + value1);
		System.out.println( "value2 : " + value2);
		System.out.println( "sum : " + sum);
	}

	public static int  findSum(int v1,int v2){
		int result;
		result = v1 + v2 ;
		//System.out.println( "result : " + result);
		return result;
		
	}

	// public static void  findSum(int v1,int v2){
	// 	int result;
	// 	result = v1 + v2 ;
	// 	System.out.println( "result : " + result);
	// 	//return result;

	// }
}