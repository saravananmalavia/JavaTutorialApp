import java.util.Scanner;
public class Ex57{
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
		obj1.setData(10,20);
		obj1.sum();
		obj1.display();
		
		obj2.setData(45,23);
		obj2.sum();
		obj2.display();
	}
}


