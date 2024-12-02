import java.util.Scanner;
public class Ex54{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		int b[]=new int[10];
		System.arraycopy(a,1,b,5,3);
		System.out.println("b array elements");
		for(int i: b)
			System.out.print(i + "  ");
		
	}
}


