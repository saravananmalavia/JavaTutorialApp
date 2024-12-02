// inner class 
class A{

	class B{
		
	}

}

A a1 = new A();
A.B b1 = new a1.B();


// static inner class
class A{

	
static class B{
		// A -all static datamembers can be accessed (only)
		
	}

}

A.B.method();


//
class A
{

	public void method{
		class B{
		
			}
			// scope will be inside method only
	}
	
}

//annonimous class
/*
Interface I{
	public void display();
}

class B implements I{
	public void display(){

	}
}*/
class A
{

	public void method{
		I a = new I(){
	
			int i;
			public void display(){

	}
}
	}
	
}






































 


