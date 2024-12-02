class Exception2{
	  public static void main(String args[]) throws Exception{  

	  	try{
	  			display();
	  	}
	  	catch(Exception e){
	  		System.out.println("Exception occoured");
	  	}
	  
	  	System.out.println("finished");
	  }




	  public static void display() throws Exception{

	  	System.out.println("I am in Display method");
	  	int a, b, c;

	  	a =10; b= 0;
	  	c = a/b;

	  	System.out.println("a :" + a);
	  	System.out.println("b :" + b);
	    System.out.println("c :" + c);

	  }
}

