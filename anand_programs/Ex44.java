import java.util.Scanner;
public class Ex44{
	public static void main(String[] str){
		int a[];
		a=new int[10];

		a[0]=10;
		a[5]=20;
		a[7]=a[0]+a[5];
		int i=5;
		System.out.println("The sum is "+a[i+2]);
	}
}


