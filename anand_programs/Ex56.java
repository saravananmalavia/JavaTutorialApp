import java.util.Scanner;
public class Ex56{
	int a,b,c;

	void sum(){
		a=10;
		b=20;
		c=a+b;
		System.out.println("The sum is "+c);
	}

	public static void main(String[] str){
		
		Ex56 obj1=new Ex56();
		obj1.sum();
		Ex56 obj2=new Ex56();
		obj2.sum();
	}
}


