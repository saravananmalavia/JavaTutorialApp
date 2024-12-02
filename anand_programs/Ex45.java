import java.util.Scanner;
public class Ex45{
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
		for(i=0;i<n;i++)
			System.out.print(a[i] + "  ");

	}
}


