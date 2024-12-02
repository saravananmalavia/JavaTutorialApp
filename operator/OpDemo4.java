public class OpDemo4{
	public static void main(String[] args){

		int x = 2;
		int y = 3; 

		int z1 = x & y; 
		int z2 = x | y;
		int z3 = x ^ y;


		System.out.println("x  : " + x);
		System.out.println("y  : " + y);
		System.out.println("z1 : " + z1);
		System.out.println("z2 : " + z2);	
		System.out.println("z3 : " + z3);
		/*
			x  : 2   10
			y  : 3   11
			 
			z1 : 2   10 (logical and)
			z2 : 3   11 (logical or)
			z3 : 1   01 (xor) (same value 0 / different value 1)

		*/

	}

}