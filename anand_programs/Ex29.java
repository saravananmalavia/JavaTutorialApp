import java.util.Scanner;
class Ex29{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int i;
		for(i=2;i<n;i+=2){
		    System.out.print("  "+i);
		}
	}
}

//2, 4, 6,....,n
