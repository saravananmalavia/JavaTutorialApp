
/* demo program for multiple catch and finally */

public class ExceptionDemo4{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      System.out.println("Line 1");
      System.out.println("args[] :" + args[0]);
      System.out.println("Line 2");
      int data=100/0;  
      System.out.println("Line 3");
      String sample = "Welcome";
      System.out.println("sample.charAt() :" + sample.charAt(sample.length()-1));
      System.out.println("Line 4");
	
	}
    catch(ArithmeticException e){
    	System.out.println("ArithmeticException " + e);
   		System.out.println("ArithmeticException " + e.getMessage());
   		System.out.println("ArithmeticException "); 
    } 
   catch(ArrayIndexOutOfBoundsException e){
   		System.out.println("ArrayIndexOutOfBoundsException" +e);
    } 
     catch(Exception e){
      System.out.println("Exception ");
    } 
    
   	finally{
   		System.out.println("I am with in finally .....");
   	}
  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  