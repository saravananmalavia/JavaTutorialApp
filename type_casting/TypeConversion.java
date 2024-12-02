class TypeConversion{
	public static void main(String[] args){
		int i = 300;
		byte b = 15;
		double d = 10.0;

		d = i; //Automatic type conversion -- smaller to bigger
		i = (int)d; // explict type conversion -- bigger to smaller

		//i = b; //(process of converting one type to another type casting)
		//b = (byte)i;
		System.out.println("i : " + i);
		System.out.println("b : " + b);
		System.out.println("d : " + d);
	}
	
}
