interface Idemo{
	double PI = 3.14;
	public void display(); //by default abstract
}

class A implements Idemo{
	public void display(){
		System.out.println("I am from class A");
	}
}

class B implements Idemo{
	public void display(){
		System.out.println("I am from class B");
	}
}


class TestInterface1{

	public static void main(String[] args) {
		//Idemo iDemo1 = new Idemo();

		A a1 = new A();
		//a1.display();

		B b1 = new B();
		//b1.display();


		//Idemo iDemo1 = b1;

		Idemo iDemo1 = new B();

		iDemo1.display();

	}
}









