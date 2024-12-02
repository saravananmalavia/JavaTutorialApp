class StringDemo1{
	public static void main(String args[]){
 
		String s1 = "java";  // creating string using string literal
		String s2 = "java world";  // same memory address and same content
		
		String s3 = new String("java"); 
		String s4 = new String("java"); // using new key word
							// everytime it creates new object
							// content same with different address


		String s5,s6;

		if(s1 == s2){   // it compares the address
			s5 = "s1 == s2 : s1 and s2 are equal";
		}else{
			s5 = "s1 == s2 : s1 and s2 are Not equal";
		}


		if(s1.equals(s2)){ // it compares the content
			s6 = "s1.equals(s2)) : s1 and s2 are equal";
		}else{
			s6 = "s1.equals(s2)) : s1 and s2 are Not equal";
		}



		if(s3 == s4){   // it compares the address
			s5 = "s1 == s2 : s1 and s2 are equal";
		}else{
			s5 = "s1 == s2 : s1 and s2 are Not equal";
		}


		if(s3.equals(s4)){ // it compares the content
			s6 = "s1.equals(s2)) : s1 and s2 are equal";
		}else{
			s6 = "s1.equals(s2)) : s1 and s2 are Not equal";
		}




		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3); 
		System.out.println(s4); 

	}
	
}