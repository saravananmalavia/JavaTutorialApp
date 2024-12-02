
class VariableDemo{
	 static double  value2; // class variable
	 int value3; // instance variable (object)
	 			// default value will be assigned
	public static void main(String args[]){


		// int i = 0 ;

		// System.out.println(i);
		// System.out.println(value2);

		int j = 5; // for local variable, no default value
			 // assignment =
		if(j == 5){  // comparison ==
			int value1; // local varaible
			value1 = 10;
			System.out.println("value1 : " + value1);
		} // scope of value1 will be available 
		  //only with in this if block 
		 //since it is declared with in if block 
		
		//System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("j : " + j);

	}
}