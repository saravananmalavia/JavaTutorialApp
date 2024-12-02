interface A1{
	public void print();

}
interface A2{
	public void print();

}
class B implements A1, A2{
	public void print3(){
		System.out.println("I am from print3() ");

	}
	public void print(){
		System.out.println("I am from print() ");
	}

}

class InterfaceDemo2{
	public static void main(String args[]){

		B b1 = new B();
		b1.print();
		b1.print3();

		
	}
}

