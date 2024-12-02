package pack2;
import pack1.A;

//Different package Other class
public class E {

	public void display(){
		A objA = new A();
		System.out.println("Different package Other class");
		System.out.println("***********************");
		System.out.println("publicI    : " + objA.publicI);
		// protected can't be accessed in different package other class even with object
		// System.out.println("protectedI : " + objA.protectedI);
		// friendly can't be accessed in different package other class even with object
	
		// System.out.println("friendlyI  : " + objA.friendlyI);
		// private can't be accessed in different package other class even with object
		// System.out.println("privateI   : " + objA.privateI);
	}

}