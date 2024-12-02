class StringDemo2{
	public static void main(String[] args) 
	{

		char ch[]={'s','t','r','i','n','g','s'}; 
		String s1 = "Welcome to Java";
		StringBuffer sb1 = new StringBuffer("I Love");
		StringBuffer sb2 = new StringBuffer("INDIA");

		String s2 = new String(ch);
		System.out.println(s2);
		System.out.println(" S2 length :" + s2.length());

		// root class - Object  - equals()

		System.out.println("charAt() : " + s1.charAt(5));
		System.out.println("subString : " + s1.substring(5));
		System.out.println("subString : " + s1.substring(5,9));
		System.out.println("s1.concat(s2): " + s2.concat(s1));
		System.out.println("s1.replace('o','@'): " + s1.replace('o','@'));
		System.out.println("s1.contains(\"to\"): " + s1.contains("tooo"));
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("sb1.append(sb2) : " + sb1.append(sb2));
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);

	}
}

// String immutable
// StringBuffer mutable


