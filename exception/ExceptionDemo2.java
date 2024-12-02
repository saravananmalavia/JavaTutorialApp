import java.util.*;
class ExceptionDemo2{
	public static void main(String args[]){

		int a,b,c,d;

		    a = 10;
			b = 20;
			c = 0;

		try{
		
			System.out.println("   a : " + a);
			System.out.println("   b : " + b);

			//c =  b/(b-a);  	
			c =  b/(a-10); 
				
			System.out.println(" try block end");

		}catch(Exception e){
		
			c =  b/(a-5);	
		System.out.println(" catch block end");
		}
		finally{
			System.out.println("finally block ");
		}

		System.out.println("   c : " + c);
		System.out.println(" program end");
		
		
	}
}

/*
try
catch
--------
finally
throw
throws
*/