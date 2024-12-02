import java.util.Scanner;
class Ex24{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int i=5;
		while(i<=n){
		    System.out.print("  "+i);
		    i+=5;
		}
		 	
	}
}

//5, 10, 15,....,n
