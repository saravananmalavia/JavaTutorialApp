package pack1;
import pack2.*;

public class A{

	public int i = 10;
	protected int j = 20;
	int k = 30;  // friendly 
	private int l = 40;


	public void display(){
		System.out.println("Same Package same class");
		System.out.println("***********************");
		System.out.println("public     i  : " + i);
		System.out.println("protected  j  : " + j);
		System.out.println("friendly   k  : " + k);
		System.out.println("private    l  : " + l);

	}

	public static void main(String args[]){
		A a1 = new A();
		a1.display();

		B b1 = new B();
		b1.displayB();

		C c1 = new C();
		c1.displayC();

		D d1 = new D();
		d1.displayD();

		E e1 = new E();
		e1.displayE();

	}

}









