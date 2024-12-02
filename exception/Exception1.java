class Exception1{
	  public static void main(String args[]){  

	  	int a,b,c;

	    	/*a = 0;
	  		b = 10;
	  		c = b/a;
	  		System.out.println("a :" + a);
	  		System.out.println("b :" + b);
	  		System.out.println("c :" + c);*/

	  	try{

	  		a = 10;
	  		b = 10;
	  		int numbers[] = {0,1,2,3,4,1};
	  		
	  		System.out.println("a :" + a);
	  		b  = a/numbers[0];
	  				try{
	  					b  = a/numbers[0];
	  				}
	  				catch(ArithmeticException e){
	  					System.out.println("ArithmeticException Error : ");
	  					b = a/numbers[1];

	  				}
	  				
	  				
	  		c = b/numbers[5];

	  		//c = Integer.parseInt("10.90");

	  		System.out.println("b :" + b);
	  		System.out.println("c :" + c);

	  	}
	  	catch(ArithmeticException e){
	  					System.out.println("ArithmeticException Error : ");
	  					//b = a/numbers[1];

	  				}

	  	
	  	catch(ArrayIndexOutOfBoundsException e){
	  		System.out.println("ArrayIndexOutOfBoundsException Error : ");
	  	}

	  	catch(Exception e){
	  		System.out.println("Error : ");
	  	}
	  	
	  	finally{
	  		System.out.println("I am in finally");
	  	}
	  	System.out.println("Finished");


	  	
		
	  }
}