import java.util.*;
public class LoopingDemo1 {  
	public static void main(String[] args) {  

		// Scanner in = new Scanner(System.in);
		// int day;

		// System.out.println("enter the value of day");
		// day = in.nextInt();

		// System.out.print("1 ");
		// System.out.print("2 ");
		// System.out.print("3 ");
		// System.out.print("4 ");
		// System.out.println("5 ");
		for(int i=1;i<=10;i++){
			
			System.out.print(i + " ");
		}

	   System.out.println();
		int k = 1;

		while(k<=10){
			System.out.print(k + " ");
			k ++;

		}

		// for and while --- entry check
		// do while -- exit check



		System.out.println();
		int j = 1;

		do{
			System.out.print(j + " ");
			j += 1;

		}while(j<=10);



		




	}
}