class WrapperDemo{
	public static void main(String[] args){

		String s1 = "10";
		String s2 = "20";
		String result = s1 + s2;
		// Integer.parseInt() can be used to converting number in 
		//String format "10" to int 10
		// Integer - wrapper (convert primitive data type into object)
	     //Double.parseDouble("10.0");

		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(result);
		System.out.println(sum);

		//Boxing unboxing
		// Boxing - process of converting primitive type into object
		// UnBoxing - process converting object to primitive

		int i = 10;
		Integer intObj1 = i;// Boxing

		System.out.println("intObj1 : " + intObj1);

		int j = intObj1; // UnBoxing

		System.out.println("j : " + j);








	}
}