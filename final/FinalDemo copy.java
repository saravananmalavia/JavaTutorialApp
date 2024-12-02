/* final keyword
can be implemented with 
1. class
	final class 
		- can't be extended (inheritated)
2. method 
		- final method cann't be overrided 

3. variable. - final varaible (constant) - value can't be changed
			 - must be initialized while declaring final variable
*/

class FinalDemo{
	
	public static void main(String args[]){

		// int value;
		// value = 10;
		// value = 20;

		// final int MAX_MARK = 100;
		// //MAX_MARK = 120; //  - final value can't be changed

		// System.out.println("value : " + value);
		// System.out.println("MAX_MARK : " + MAX_MARK);


		Person person = new Person();
		//Student student = new Student();
		person.display();
		//student.display();



	}
}
// Runtime poly
// late binding
// method overrding
// more than one method can have same name and same params
// one defintion available in the base class another in the sub clas
// execution will be depends on the object by in which it is called
// base class object. --- base class method
// sub class object -- sub class method


// final class Person{ // - can't be extended

class Person{

	//public final  void display(){ // - final method cann't be overrided 
	  public  void display(){
		System.out.println(" I am from Person class");
	}

} 
class Student extends Person{

	public  void display(){
			System.out.println(" I am from Student class");
		
	}

}










