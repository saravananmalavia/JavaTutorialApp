import java.util.Scanner;
class Arith{
	private int a,b,c;

	void setA(int a){
		this.a=a;
	}
	void setB(int b){
		this.b=b;
	}
	int getA(){
		return(a);
	}
	int getB(){
		return(b);
	}
}

public class Ex65{
	public static void main(String[] str){
		Arith obj1=new Arith();
		obj1.setA(20);
		obj1.setB(90);
		int s=obj1.getA() + obj1.getB();
		System.out.println("The sum is "+s);
	}
}


