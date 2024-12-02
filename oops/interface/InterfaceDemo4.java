class InterfaceDemo4{
	public static void main(String args[]){
		
		Sub objSub = new Sub();
		objSub.display();
		// objSub.print();
	}
}

interface Base1 {
	public void display();

}
interface Base2 {
	public void display();

}

class Sub implements Base1,Base2{
	public void display(){
		System.out.println("I am from sun class");
	}

}