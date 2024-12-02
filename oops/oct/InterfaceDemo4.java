interface A1{
	public void print1();
	public void print2();

}

abstract class B  implements A1{
	public void print4(){
		System.out.println("I am from print4() ");

	}
	public void print1(){
		System.out.println("I am from print1() ");
	}
	

}
class C extends B{
	public void print2(){
		System.out.println("I am from print1() ");
	}
}

class InterfaceDemo4{
	public static void main(String args[]){

		C c1 = new C();
		c1.print1();
		c1.print2();
		c1.print4();
		
	}
}
