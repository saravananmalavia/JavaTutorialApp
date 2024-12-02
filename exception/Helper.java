import java.util.Scanner;

public class Helper{

	public static int getI(){
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		return value;
	}

	public static void main(String args[]){
		int v;
		try{
			System.out.println("Enter a integer value");
			v = getI();
			System.out.println("V :" + v);

		}
		/*catch(Exception e){
				System.out.println("Error :" + e);
		}*/
		
		finally{
			//close()
			System.out.println("I am with in finally block");
		}
		
		
		System.out.println("Program ends");
	}

}

/*
try {} -- code to be monitored 
catch {} - code to handle the exception must be with in the catch block
finally
throw
throws

*/
