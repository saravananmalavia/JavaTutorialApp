class AbstractDemo3{
	public static void main(String args[]){
		B b1 = new B(10,20);
		b1.display();
	}
	
}
abstract class A{
	int i;
	public A(){
				System.out.println("I am from A constructor");

	}
	public A(int i){
		this.i =i;
				System.out.println("I am from A(i) constructor");
	}

	public abstract void display();
	
}
class B extends A{
	int j;
	public B(){
		super();

		System.out.println("I am from B constructor");
	}
	public B(int i,int j){
		super(i);
		this.j =j;
				System.out.println("I am from B constructor");
	}

	public  void display(){
		System.out.println("i :" + i);
		System.out.println("j :" + j);
	}
}