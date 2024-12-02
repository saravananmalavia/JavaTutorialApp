class InterfaceDemo1{
	public static void main(String args[]){
		ABC objABC = new ABC();
		objABC.display();
		objABC.print();
		objABC.welcome();
		// can be accessed using class name since by default it is static
		System.out.println("MAX_MARK : " + ABC.MAX_MARK);
	
	}
}

interface Inter1{
	int MAX_MARK = 100;
	public void display(); 
}
interface Inter2{
	public void print(); 
}
// interface can be extended from more than interface
// it is not possible with class
// that means a class can't have more than one base class
interface Inter3 extends Inter1,Inter2{
	public void welcome(); 
}
class ABC implements  Inter3{
//class ABC implements  Inter1,Inter2{

	   public void display()
		{
			//MAX_MARK = 100; // can't be changed since final by default
			System.out.println("MAX_MARK : " + MAX_MARK);
			System.out.println("I am from  display");
		}
		public void print()
	
		{
			System.out.println("I am from print");
		}
		public void welcome()
		{
			System.out.println("I am from  welcome");
		}

}

class XYZ {

}
// class can be extended from a base calss
// and implents any number of interface
class KLM extends XYZ implements Inter3{
	 public void display()
		{
			System.out.println("I am from  display");
		}
		public void print()
	
		{
			System.out.println("I am from print");
		}
		public void welcome()
		{
			System.out.println("I am from  welcome");
		}

}

class IJK extends ABC{

}


