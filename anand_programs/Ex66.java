import java.util.Scanner;
class Arith{
	private int a,b,c;

	Arith(){
		a=10;
		b=20;
		c=a+b;
		System.out.println("The sum is "+c);
	}
	Arith(int x){
		a=b=x;
		c=a+b;
		System.out.println("The sum is "+c);
	}
	Arith(int a, int b){
		this.a=a;
		this.b=b;
		c=this.a+this.b;
		System.out.println("The sum is "+c);
	}
	Arith(Arith ar){
		a=ar.a;
		b=ar.b;
		c=a+b;
		System.out.println("The sum is "+c);
	}
}

public class Ex66{
	public static void main(String[] str){
		Arith obj1=new Arith();
		new Arith(30);
		new Arith(60,55);
		new Arith(obj1);
	}
}


