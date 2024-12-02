public class OperatorDemo5{
	public static void main(String xyz[]){ 

		int x = 100;
		int y = 100;
		int z = 30;

		System.out.println("The given Numbers are  ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

		if (( x > y ) && (x > z)) {
			System.out.println("Biggest Number is X ");
		} else if((y > x) && (y > z)){
			System.out.println("Biggest Number is Y ");
		} else if((z > x) && (z > y)){
			System.out.println("Biggest Number is Z ");
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}