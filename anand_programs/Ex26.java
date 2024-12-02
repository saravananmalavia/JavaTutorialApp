import java.util.Scanner;
class Ex26{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int i=5;
		while(true){
		    System.out.print("  "+i);
		    i+=5;
		    if (i>n)
		    	break;
		}
		 	
	}
}

//5, 10, 15,....,n
