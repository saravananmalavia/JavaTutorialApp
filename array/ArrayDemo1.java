import java.util.*;
class ArrayDemo1{
	public static void main(String args[]){

		int value1;
		 value1 = 10;

		System.out.print("value1 " + value1);

		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the no elements");
		n = input.nextInt();

		int values[] = new int[n]; // creation

		for(int i = 1;i<values.length;i++){
			System.out.println("Enter the element");
			values[i] = input.nextInt();
		}

		// int value1 = 10; 

		// int values[]; //declaration
		// values = new int[5]; // creation

		//int values[]  = new int[5]     //declaration + creation

		// values[0] = 10;
		// values[1] = 20;
		// values[2] = 30;
		// values[3] = 40;
		// values[4] = 50;

		//int values[] = {10,20,30,40,50,60};

		// System.out.println(values[0]);
		// System.out.println(values[1]);
		// System.out.println(values[2]);
		// System.out.println(values[3]);
		// System.out.println(values[4]);

		System.out.println("The array elemnts are ");
		for(int i=0;i<values.length;i++){
			System.out.print(values[i] + " ");
		}


	}
}

/*

1. declaration
2. creation
3. initialization
*/
