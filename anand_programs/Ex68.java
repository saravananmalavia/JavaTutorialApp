import java.util.Scanner;
class Arith{
	private int a,b,c;
	static int count;
	static{
		count=1000;
	}
	Arith(){
		count++;
	}

	void display(){
		System.out.println("count = "+ count);
	}
	
}

public class Ex68{
	public static void main(String[] str){
		Arith obj1=new Arith();
		obj1.display();
		new Arith();
		obj1.display();
		new Arith();
		obj1.display();
		new Arith();
		obj1.display();
		new Arith().display();
	}
}


