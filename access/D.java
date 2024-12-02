package pack2;
import pack1.A;
//Different  package Sub class
public class D extends A{

	public void display(){
		System.out.println("Different package Sub class");
		System.out.println("***********************");
		System.out.println("publicI    : " + publicI);
		System.out.println("protectedI : " + protectedI);
		//friendly can't be accessed in sub class different package
		// System.out.println("friendlyI  : " + friendlyI);
		//Private can't be accessed in sub class different package
		//System.out.println("privateI   : " + privateI);
	}

public static void main(String args[]){	
		D objD = new D();
		objD.display();

		 E objE = new E();
		 objE.display();

		
	}

}
/*
// //Different package Other class
public class E {

	public void display(){
		A objA = new A();
		System.out.println("Different package Other class");
		System.out.println("***********************");
		System.out.println("publicI    : " + objA.publicI);
		// protected can't be accessed in different package other class even with object
		// System.out.println("protectedI : " + objA.protectedI);
		// friendly can't be accessed in different package other class even with object
	
		//System.out.println("friendlyI  : " + objA.friendlyI);
		// private can't be accessed in different package other class even with object
		//System.out.println("privateI   : " + objA.privateI);
	}

}
*/
