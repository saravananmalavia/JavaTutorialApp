import java.util.Scanner;
public class Ex49{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[25];

		int i,j,n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();

		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
				if (a[i]>a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}

		System.out.println("\nAfter sorting");
		for(i=0;i<n;i++)
			System.out.print(a[i] + "  ");
	}
}


