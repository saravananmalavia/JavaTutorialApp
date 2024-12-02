class InterfaceDemo3{
	public static void main(String args[]){
		
		Sub objSub = new Sub();
		objSub.display();
		// objSub.print();
	}
}

class Base0{

}

class Base1 extends Base0{
	public void display(){

	}

}
class Base2 extends Base0{
	public void display(){
		
	}

}

class Sub extends Base1,Base2{

}