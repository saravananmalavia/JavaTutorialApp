import java.util.Scanner;
public class Ex58{
	int a,b,c;
	void setData(int x,int y){
		a=x;
		b=y;
	}
	void sum(){
		c=a+b;
	}
	void display(){
		System.out.println("The sum is "+c);
	}

	public static void main(String[] str){
		Ex57 obj1=new Ex57();
		Ex57 obj2=new Ex57();
		obj1.a=77;
		obj1.b=55;
		obj1.sum();
		obj1.display();
		
		obj2.a=90;
		obj2.b=45;
		obj2.sum();
		obj2.display();
	}
}


