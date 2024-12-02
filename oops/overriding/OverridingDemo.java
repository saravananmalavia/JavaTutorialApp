class OverridingDemo{
	public static void main(String args[]){

		BaseA base = new BaseA();
		SubB sub =new SubB();
		
		// base.display();
		// sub.display();

		BaseA base1  = new SubB();
		base1.display();

		// SubB sub1 = (SubB)(new BaseA());
		// sub1.display();

	}
}

class BaseA{

	public  void display(){
		System.out.println("I am from Base A");
	}

}
class SubB extends BaseA{

	public  void display(){
		System.out.println("I am from Sub B");
	}

}