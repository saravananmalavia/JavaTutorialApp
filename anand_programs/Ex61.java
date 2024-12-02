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

public class Ex61{
	public static void main(String[] str){
		int a=50,b=10;
		int s=new Arith().add(a,b);
		System.out.println("The sum is "+s);
		System.out.println("The difference is "+new Arith().sub(a,b));
		System.out.println("The product is "+ new Arith().mul(a,b));
	}
}


