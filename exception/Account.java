import java.util.Scanner;
class MBException extends Exception{
	public MBException(){
		System.out.println("Minimum blance should be 500");
	}
}
class Account{
	 public static void main(String[] args) 
	{ 
		// try{
		// 	getBalance();
		// }
		// catch(Exception e){

		// }
	 	
	 	getBalance();

	 	System.out.println("Good Bye");

	 }

	 public static void getBalance() {//throws MBException
	 

	 	int balance;
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter the balance");
	 	balance = sc.nextInt();
	 	
	 		try{
		 		if(balance < 500){
		 			throw new MBException();
		 		

		 		}
	 		}
	 		catch(Exception e){

			 }
	 	
	 	System.out.println("Balace Amount :" + balance);

	 }










}