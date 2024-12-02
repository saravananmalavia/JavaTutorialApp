class InterfaceDemo5{
	public static void main(String args[]){
		
		// Sub1 objSub1 = new Sub1();
		// objSub1.display();
		// Sub2 objSub2 = new Sub2();
		// objSub2.display();

		Base base1 = new Sub1(); // Sub1 should impements the interface base
		//base1.display();
		Base base2 = new Sub2(); // Sub2 should impements the interface base
		//base2.display();
		dynmicBinding(base2);


	}

	public static void dynmicBinding(Base objBase){
		objBase.display();
	}
}

interface Base {
	public void display();

}

class Sub1 implements Base{
	public void display(){
		System.out.println("I am from sub1 class");
	}

}

class Sub2 implements Base{
	public void display(){
		System.out.println("I am from sub2 class");
	}

}