 class StringMethodDemo1{
 public static void main(String[] args) {
    String txt = "Hello World 123";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
    System.out.println(txt.length());
    System.out.println(txt.indexOf("l")); 
    System.out.println(txt.indexOf("World")); 
    System.out.println(txt.lastIndexOf("l")); 
    
    String firstName = "John";
	String lastName = "Doe";
	System.out.println(firstName + " " + lastName);
    System.out.println(firstName.concat(lastName));
    
    String result = firstName.concat(lastName);
    
    System.out.println(txt);
    
    System.out.println(result);
    
     System.out.println("***********************");
    String myStr = "Hello";
    char output = myStr.charAt(3);
    System.out.println(output);
    
       System.out.println("***********************");
    String myStr1 = "zbc";
	String myStr2 = "ac";
	System.out.println(myStr1.compareTo(myStr2));
    
  }
}