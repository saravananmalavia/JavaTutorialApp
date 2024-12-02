class MethodDemo1 {
	public static void main(String args[]) {

		int values[] = {20,45,67,89,90};
		
		int result = TestArryPassing.findArraySum(values);
		System.out.print("The given elements are ");
		for(int val : values) {
			System.out.print(val + " ");
		}
		System.out.print("\nsum :" + result);
		System.out.println();

	}

	
}
class TestArryPassing{

public static int findArraySum(int numbers[]){
		int sum = 0;
		for(int i= 0; i< numbers.length;i++){
			sum += numbers[i];
		}
		return sum;
	}
	
}





