import java.util.*;
class Helper{

	static Scanner scanner = new Scanner(System.in);

	public static double getArrayAverage(int values[]){

		int sum = 0; double avg;
		for(int i=0;i<values.length;i++){
			sum += values[i];
		}
		avg = sum/values.length;

		return avg;
	}

	public static int getI(){
		int val = scanner.nextInt();
		return val;
	}

	public static double getD(){
		double val = scanner.nextDouble();
		return val;
	}

	public static String getS(){
		String val = scanner.next();
		return val;
	}

	public static void sop(String message){

		System.out.println(message);

	}


}