interface A1{
	public void print1();

}
interface A2{
	public void print2();

}
interface A3 extends A1, A2{
	public void print3();

}
class sub{
	public void printSub(){
		System.out.println("I am from printSub() ");
	}
}
class B extends sub implements A3{
	public void print4(){
		System.out.println("I am from print4() ");

	}
	public void print1(){
		System.out.println("I am from print1() ");
	}
	public void print2(){
		System.out.println("I am from print2() ");
	}
	public void print3(){
		System.out.println("I am from print3() ");
	}

}

class InterfaceDemo3{
	public static void main(String args[]){

		B b1 = new B();
		b1.print1();
		b1.print2();
		b1.print3();
		b1.print4();
		b1.printSub();

		
	}
}
