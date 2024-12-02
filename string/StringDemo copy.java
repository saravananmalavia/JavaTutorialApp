class StringDemo{
	
	public static void main(String[] args) 
	{
		// String is immutable
		// == compare the address of the object
		
		
		String sample1 = "Welcome"; // By string literal
		String sample2 = "Welcome";

		//System.out.println(sample1);

		String sample3 = new String("Keltron"); // By new keyword
		//System.out.println(sample3); 

		String sample4 = new String("Keltron"); // By new keyword
		//	System.out.println(sample4); 

		if(sample1 == sample2){
			System.out.println("sample1 == sample2");
		}
		else
		{
			System.out.println("sample1 != sample2");
		}

		if(sample3 == sample4){
			System.out.println("sample3 == sample4");
		}
		else
		{
			System.out.println("sample3 != sample4");
		}

		if(sample1.equals(sample2)){
			System.out.println("sample1.equals(sample2) true");
		}
		else
		{
			System.out.println("sample1.equals(sample2) false");
		}

		if(sample3.equals(sample4)){
			System.out.println("sample3.equals(sample4) true");
		}
		else
		{
			System.out.println("sample3.equals(sample4) false");
		}








	}

}