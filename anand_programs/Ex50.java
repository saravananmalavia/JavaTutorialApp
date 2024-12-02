import java.util.Scanner;
public class Ex50{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[25];

		int i,j,n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the number to be searched");
		j=sc.nextInt();
			
		for(i=0;i<n;i++)
			if (a[i]==j){
			   System.out.print("The number is found at "+(i+1));
			   break;
			}
		if (i==n){
			System.out.println("The number is not found...");
		}
	}
}


