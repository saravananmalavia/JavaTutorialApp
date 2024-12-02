import java.util.Scanner;

public class Input{

	public static int getI(){
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		boolean flag = true;
		do{
			try{
					value = scanner.nextInt();
					flag = false;
			}
			catch(Exception e){
				System.out.println("Invalid input, kindly enter a valid integer");
				scanner.next();
			}
		}while(flag);

		return value;
	}

	public static void main(String args[]){
			int v;
			System.out.println("Enter a integer value");
			v = getI();
			System.out.println("v :" + v);
			
	}

}

/*
try {} -- code to be monitored 
catch {} - code to handle the exception must be with in the catch block
finally
throw
throws

*/
