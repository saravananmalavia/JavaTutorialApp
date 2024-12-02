class InterfaceDemo2{
	public static void main(String args[]){

	}
	
}

class A{

	public void display(){

	}

}
class B{
	public void display(){
		
	}

}
class C extends A,B
{
	public static void main(String args[]){
		C c1 = new C();
		  c1.display();
	}

}









interface A{

	public void display();

}
interface B{
	public void display();

}
class C implements A,B
{
	public void display(){
		
	}
	public static void main(String args[]){
		C c1 = new C();
		  c1.display();
	}

}


























