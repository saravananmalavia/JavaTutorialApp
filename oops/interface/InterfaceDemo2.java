class InterfaceDemo2
{
	public static void main(String args[]){

	}
	
}

interface iBase1{

	public void display1();

}
interface iBase2{

	public void display2();
}

interface iBase3 extends iBase1,iBase2{

	public void display3();

}

class Base1{

}

class TestInterface extends Base1 implements iBase3{

	public void display3(){

	}
	public void display1(){
		
	}
	public void display2(){
		
	}

}














