class AbstractDemo{
	public static void main(String args[]){
		// BaseA objA = new BaseA(); // since BaseA is an abstract class

		SubB objB = new SubB();
		objB.display("abstarct demo");
		objB.print();

	}
}

abstract class BaseA{
	int value1 = 10;
	static int commonValue =20;
	public abstract void display(String msg);

	public void print(){
		System.out.println("I am from BaseA class");	
	}

	public abstract void display2(String msg);

}
class SubB extends BaseA{
	int value2 = 30;

	public void display(String msg1){
		
		System.out.println("I am from SubB class");
		System.out.println("value1 : " + value1);
		System.out.println("commonValue : " + commonValue);
		System.out.println("value2 : " + value2);
	}
	public void display2(String msg){

	}
}




