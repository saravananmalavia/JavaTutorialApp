interface inter1{
	int val = 10;
	public  void display();
	public void print();
}

class Test1 implements inter1{
	public  void display(){
		System.out.println("I am from Test1 display() ");
	}
	public  void print(){
		//val = 20;
		System.out.println("I am from Test1 print()  val " + Test1.val);

		//inter1 i1 = new inter1();
		
	}
}

class Test2 implements inter1{
	public  void display(){
		System.out.println("I am from Test2 display() ");
	}
	public  void print(){
		System.out.println("I am from Test2 print() val " + Test2.val);

		//inter1 i1 = new inter1();		
	}
}
class InterfaceDemo1{
	public static void main(String args[]){
		inter1 i1 = new Test1();
		i1.display();
		i1.print();

		inter1 i2 = new Test2();
		i2.display();
		i2.print();
	}
}