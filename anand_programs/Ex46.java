import java.util.Scanner;
public class Ex46{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[25];

		int i,n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();

		System.out.println("The array elements are");
		for(int x:a)
			System.out.print(x + "  ");
		
		System.out.println("\nThe array elements in reverse order");
		for(i=n-1;i>=0;i--)
			System.out.print(a[i] + "  ");
	}
}


