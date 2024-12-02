public class OperatorDemo6{
	public static void main(String xyz[]){ 

		int x = 2202;
		int y = 4;

		// 00 00 00 10
		// 00 00 01 00 -- left shift ( 1 time << result * 2)
		// 00 00 00 10 -- right shift ( 1 time >> result / 2)
		int z1 = x << 1;
		int z2 = y >> 1;

			
			System.out.println("x       : " + x);
			System.out.println("x << 1  : " + z1);
			System.out.println("y       : " + y);
			System.out.println("y >> 1  : " + z2);
			System.out.println("~~~~~~~~~~~~~~~~");
		

		
	}
}