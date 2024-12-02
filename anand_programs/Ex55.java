import java.util.Scanner;
public class Ex55{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		int b[]=a.clone();
		System.out.println("b array elements");
		for(int i: b)
			System.out.print(i + "  ");
		
	}
}


