import java.util.Scanner;
public class Ex53{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[][]={{1,2,3},{5,6,7,8,9},{3,4}};

		int i,j,n,m;
		System.out.println("The matrix is");
		
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++)
			   System.out.print(a[i][j] + "  ");
			System.out.println();			   
		}	
	}
}


