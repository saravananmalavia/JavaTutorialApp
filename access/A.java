package pack1;
import pack2.*;
//Same package same class
public class A{

	public int publicI = 10;
	protected int protectedI = 20;
	int friendlyI = 30 ;
	private int privateI = 40;

	public void display(){
		System.out.println("Same package same class");
		System.out.println("***********************");
		System.out.println("publicI    : " + publicI);
		System.out.println("protectedI : " + protectedI);
		System.out.println("friendlyI  : " + friendlyI);
		System.out.println("privateI   : " + privateI);
	}



	public static void main(String args[]){	
		A objA = new A();
		objA.display();

		B objB = new B();
		objB.display();

		C objC = new C();
		objC.display();

		D objD = new D();
		objD.display();

		E objE = new E();
		objE.display();
	}
}


//Same package Sub class
class B extends A{

	public void display(){
		System.out.println("Same package Sub class");
		System.out.println("***********************");
		System.out.println("publicI    : " + publicI);
		System.out.println("protectedI : " + protectedI);
		System.out.println("friendlyI  : " + friendlyI);
		//Private can't be accessed in sub class
		//System.out.println("privateI   : " + privateI);
	}

}

//Same package Other class
class C {

	public void display(){
		A objA = new A();
		System.out.println("Same package Other class");
		System.out.println("***********************");
		System.out.println("publicI    : " + objA.publicI);
		System.out.println("protectedI : " + objA.protectedI);
		System.out.println("friendlyI  : " + objA.friendlyI);
		// private can't be accessed in other class even with object
		//System.out.println("privateI   : " + objA.privateI);
	}

}







