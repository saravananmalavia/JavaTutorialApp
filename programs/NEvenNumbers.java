import java.util.*;
public class NEvenNumbers {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int n, initialNumber,count;
		initialNumber = 1;
		count = 0 ;
		System.out.println("Enter the value N");
		n = input.nextInt();

		do{
			if(initialNumber % 2 == 0){
				System.out.print(initialNumber + " ");
				count ++;
			}
			initialNumber ++;

		}while(count < n);
		System.out.println( "\ncount : " + count);
	}
}