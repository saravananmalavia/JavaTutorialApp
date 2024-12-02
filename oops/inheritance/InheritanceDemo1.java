// Multiple inheritance is not supported

class InheritanceDemo1{
	public static void main(String args[]){
			C c1 = new C();
			c1.display();
			// A a = new A();
			// B b = new B();
			// a.display();
			// b.display();
	}
}
class A{
	public void display(){
		System.out.println("I am from class A");
	}

}
class B{
	public void display(){
		System.out.println("I am from class B");
	}
}
//multiple inheritance
class C extends A,B{

}