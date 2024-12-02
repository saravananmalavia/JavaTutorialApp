class InterfaceWithMultipleInheritance{

	public static void main(String args[]){
		C objC = new C()
		objC.display(); 
		//  for objC, both the display method of  Class A and B is available
		// so there is a confusion for C, so that it is not supported
	}

}

interface A{
	public void display();

}
interface B{
	public void display();
}
class C implements A,B{

	public void display(){
		System.out.println("I am from A");
	}

}