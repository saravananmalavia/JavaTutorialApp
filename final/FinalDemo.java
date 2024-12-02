class FinalDemo{
	public static void main(String args[]){


		A a1 = new A();
		a1.display();

		B b1 = new B();
		b1.display1();

	}
	
}

//final data member
class A{
	final double PI ; // = 3.14; blank final

		public A(){
			PI = 3.14;
		}

	public  final void display(){

		//PI = 3.1417; // final can't changed
		System.out.println("PI : " + PI);
	}

}



// // final method
// class A{

// public final void display(){
// 	System.out.println("I am from class A display");
// }

// }
class B extends A{

	// final method can't be override
	public void display1(){
		System.out.println("I am from class B display");
	}

}


// Final class 
// final class A{



// }

// class B extends A{
	// final can't extended
// }