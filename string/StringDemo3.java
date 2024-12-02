class StringDemo3{
	public static void main(String[] args) 
	{

		
		String s1 = "I Love";
		String s2 = "INDIA";

		StringBuffer sb1 = new StringBuffer("I Love");
		StringBuffer sb2 = new StringBuffer("INDIA");

		s1 = s1.concat(s2);
	
		System.out.println("s1.concat(s2): " + s1.concat(s2));
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s1.replace('e','E'): " + s1.replace('e','E'));
		System.out.println("s1: " + s1);

		System.out.println("sb1.append(sb2) : " + sb1.append(sb2));
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);

	}
}