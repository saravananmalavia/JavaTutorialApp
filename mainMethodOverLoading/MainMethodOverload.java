public class MainMethodOverload  
{   
	// Overloaded main() method 1   
	//invoked when an int value is passed  
	public static void main(Integer args)   
	{   
		System.out.println("Overloaded main() method invoked that parses an integer argument");   
	}  

	// Overloaded main() method 2   
	//invoked when a char is passed  
	public static void main(char args)   
	{   
		System.out.println("Overloaded main() method invoked that parses a char argument");   
	}  

	//Original main() method  
	public static void main(String[] args)   
	{   
		System.out.println("Original main() method invoked");   
		main('K');
		main(10);
	}   
}  