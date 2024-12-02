import java.util.Scanner;
class Ex27{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int i=2;
		do{
		    System.out.print("  "+i);
		    i+=2;
		}while(i<=n);
		 	
	}
}

//2, 4, 6,....,n
