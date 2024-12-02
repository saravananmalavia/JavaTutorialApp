import java.util.Scanner;

class ArrayHandling{
	
	public static void main(String args[]){
		int input[] = new int[10];
		int sum = 0;
		int sumOdd = 0;
		int sumEven = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the values");
		for(int i=0;i<input.length;i++){
			input[i] = sc.nextInt();
		}

		System.out.println("The input values are");

		for(int i=0;i<input.length;i++){
				System.out.print(input[i] + " ");
				sum += input[i];
		}

		System.out.println("Sum " + sum);


		System.out.println("The odd  elements are");
		for(int i=0;i<input.length;i++){
			if(input[i] % 2 != 0){
				System.out.print(input[i] + " ");
				sumOdd += input[i];
			}

		}

		System.out.println("ODD Sum " + sumOdd);

		System.out.println("The Even  elements are");
		for(int i=0;i<input.length;i++){
			if(input[i] % 2 == 0){
				System.out.print(input[i] + " ");
				sumEven += input[i];
			}

		}

		System.out.println("Even Sum " + sumEven);

	}
}