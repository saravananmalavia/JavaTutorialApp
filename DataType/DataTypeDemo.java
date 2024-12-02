public class DataTypeDemo{ // Pascal Case


	public static void main(String[] args){ //Camel Case 

		// 11111111
		// 0000000011111111
		// -2^8-1 to + 2^8-1 - 1 byte (-128 to 127)
		// -2^16 to + 2^16-1 short
		//  -2^32 to + 2^32-1 int
		//  -2^64 to + 2^64-1 long


		// primitive data types - 8 types

		byte b = 127;  //Camel Case  max value 127
		short s = 11;
		int i = 13;
		long l = 2147483648L;
		//long L = 14L;   // L optional //case sen

		float f = 20.9f; // should ends with f or F
		double d = 10D; // d optional

		System.out.println("long value l : " + l); 
		System.out.println("byte value b : " + b); 

		System.out.println("double value d : " + d); 

		// System is a class - println() method
		// all builtin classes are starts with caps 
		// No methosd in java starts with caps


		boolean bool = false; // true - false

		// ASCII - 255 8 bit char 2^8 -1 
		// Unicode - 65335 16 bit char 2^16 - 1 (international language support)
		char c = 's'; // only one character unicode char


		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);


		String str = "we"; // String is not a primitive data type, Its a class in Java
	
	}

}