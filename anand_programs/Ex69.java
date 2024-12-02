import java.util.Scanner;
class Arith{
	private int a,b,c;
	static int count;
	static{
		count=2000;
	}
	Arith(){
		count++;
	}

	static void display(){
		System.out.println("count = "+ count);
	}
	
}

public class Ex69{
	public static void main(String[] str){
		Arith obj1=new Arith();
		Arith.display();
		new Arith();
		Arith.display();
		new Arith();
		Arith.display();
		new Arith();
		Arith.display();
		new Arith().display();
	}
}


