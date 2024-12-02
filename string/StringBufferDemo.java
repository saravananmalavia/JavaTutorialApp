public class StringBufferDemo{  

    public static void main(String[] args){  

    	String s1 = new String("hello1");

        StringBuffer buffer = new StringBuffer("hello"); // mutable
        System.out.println(buffer); 
        StringBuffer buffer1 = buffer.append("java");
        System.out.println("buffer1 : " + buffer1);  
        System.out.println("buffer : " + buffer);  

        System.out.println(s1);
        String s2 = s1.concat("Java1"); // immutable
        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);

    }  
}  