class finalVariable{
	final int MIN_MARK ;

	public finalVariable(){
	MIN_MARK = 0;
	}
	public static void main(String[] args){ 
		final int MAX_MARK;
		 MAX_MARK = 100;
		 // MAX_MARK = MAX_MARK + 10;
		 //MAX_MARK = 10; //  error final can't be changed 
		finalVariable f1 = new finalVariable();
			 System.out.println("MIN_MARK : " + f1.MIN_MARK);
			 System.out.println("MAX_MARK : " + MAX_MARK);
	}

}
// final class can't extended
class A
//final class A
{
	// final method can't overrided
	public final void display(){
		System.out.println("I am from class A");
	}
}
class B extends A{
	 /*public void display(){
		System.out.println("I am from class B");
	}
	*/

}


// identifier - can be any length 
//A-Z a-z 0-9 $ _ (should not start with number)
/*

*/

/**
*/