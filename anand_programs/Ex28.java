import java.util.Scanner;
class Ex28{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int i=2;
		do{
		    System.out.print("  "+i);
		    i+=2;
		    if (i>n) 
		    	break;
		}while(true);
		 	
	}
}

//2, 4, 6,....,n
