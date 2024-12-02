import java.util.Scanner;
class Arith{
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
}

public class Ex60{
	public static void main(String[] str){
		Arith obj1=new Arith();
		int a=50,b=10;
		int s=obj1.add(a,b);
		System.out.println("The sum is "+s);
		System.out.println("The difference is "+obj1.sub(a,b));
		System.out.println("The product is "+ obj1.mul(a,b));
	}
}


