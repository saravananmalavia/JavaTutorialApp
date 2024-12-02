
// Method Overloading
// more than one method in a class can have same name with differnt params
// compile time polymorphism / early binding
//method to be executed will be depends on the parameter 

class Adder{  
	static double add(double a,int b)
	{
		return a+b;	
	} 
	static double add(int a,double b)
	{
		return a+b;	
	} 
	static int add(int a,int b)
	{
		return a+b;
	} 
	/*static double add(int a,int b)
	{
		return a+b;
	} */


	static int add(int a,int b,int c)
	{
		return a+b+c;
	}  
}  
class TestOverloading1{  
	public static void main(String[] args){  
		System.out.println(Adder.add(11,11)); 
		System.out.println(Adder.add(11,11)); 
		System.out.println(Adder.add(11,11,11));  
	}
} 