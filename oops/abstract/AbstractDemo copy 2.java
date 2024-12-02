class AbstractDemo{
	public static void main(String args[]){
		//XYZ is abstract; cannot be instantiated
		//XYZ xyz = new XYZ();

		KLM klm = new KLM();
			klm.display();
			klm.greet();
			klm.print();
	}
}
abstract class XYZ{

	// abstract method
	public abstract void display();
	int value1;
	static int value2;

	public void print(){
		System.out.println("I from XYZ class");
	}

	public static void greet(){
		System.out.println("Good Evening");
	}


	
}
class KLM extends XYZ{

	public  void display(){
		System.out.println("I from KLM class");
	}
}