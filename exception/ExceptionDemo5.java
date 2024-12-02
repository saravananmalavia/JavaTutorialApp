
/* demo program for nested try block */

public class ExceptionDemo5{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception
       System.out.println("Line 0");
      //Sy  
      //System.out.println("Line 1");
          try{
              System.out.println("args[] :" + args[0]);  //ArrayIndexOutOfBoundsException
          }
          catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Error " + e);
          } 
      
      System.out.println("Line 2");
      int data=100/10;  
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
  
    catch(Exception e){
   		System.out.println("Exception " + e);
   	} 
   	finally{
   		System.out.println("I am with in finally .....");
   	}
  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  