import java.util.Scanner;
class Arith{
	static int add(int x,int y){
		int c=x+y;
		return(c);
	}
	static int sub(int x,int y){
		return(x-y);
	}
	static int mul(int x,int y){
		return(x*y);
	}
}

public class Ex62{
	public static void main(String[] str){
		int a=50,b=10;
		int s=Arith.add(a,b);
		System.out.println("The sum is "+s);
		System.out.println("The difference is "+Arith.sub(a,b));
		System.out.println("The product is "+ Arith.mul(a,b));
	}
}


