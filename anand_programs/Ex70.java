import java.util.Scanner;
class Arith{
	private int a,b,c;
	Arith(){
		a=b=c=10;
	}
	Arith(int a){
		this.a=a;
	}
	Arith(int a,int b){
		this(a);
		this.b=b;
	}
	Arith(int a,int b,int c){
		this(a,b);
		this.c=c;
	}
	void display(){
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
	}
}

public class Ex70{
	public static void main(String[] str){
		Arith obj1=new Arith(10,20,30);
		obj1.display();
	}
}


