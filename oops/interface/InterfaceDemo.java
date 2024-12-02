interface A{
	int maxMark = 100;  // all data members are static final by default

	public void display(); 

	//all member functions are abstract by default
	// so should not have any body
	// {
	// 	System.out.println("I am from interface A display");
	// }
}
class Z implements A{

	//While implementing an interface, 
	// the class must override all the abstract methods 
	//which are declared in base interface
	public void display()
	
		{
			System.out.println("I am from interface A class z display");
		}

}

class InterfaceDemo{
	public static void main(String args[]){

		//A objA = new A(); //Interface can’t have object  

		Z objZ = new Z();
		objZ.display();

	}
}
