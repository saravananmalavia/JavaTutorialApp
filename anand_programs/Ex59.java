import java.util.Scanner;
public class Ex59{
	int add(int x,int y){
		int c=x+y;
		return(c);
	}
	int sub(int x,int y){
		return(x-y);
	}
	int mul(int x,int y){
		return(x*y);
	}
	public static void main(String[] str){
		Ex59 obj1=new Ex59();
		int a=25,b=12;
		int s=obj1.add(a,b);
		System.out.println("The sum is "+s);
		System.out.println("The difference is "+obj1.sub(a,b));
		System.out.println("The product is "+ obj1.mul(a,b));
	}
}


