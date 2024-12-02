import java.util.Scanner;
public class Ex51{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];

		int i,j,n,m;
		System.out.println("Enter the order of the matirix");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("Enter the matrix");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();

		System.out.println("The matrix is");
		
		for(i=0;i<m;i++){
			for(j=0;j<n;j++)
			   System.out.print(a[i][j] + "  ");
			System.out.println();			   
		}
		
	}
}


