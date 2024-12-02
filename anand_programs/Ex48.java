import java.util.Scanner;
public class Ex48{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		int s=0;
		
		for(int x:a){
			s+=x;
		}
		System.out.print("The sum is "+s);		
	}
}


