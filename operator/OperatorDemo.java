public class OperatorDemo{
	public static void main(String xyz[]){ 

		int x = 10;
		int y = 100;

		//x++;  x = x +1;
		// ++x; x = x + 1;
        System.out.println("X : " + x);
		System.out.println("X : " + (x++));
		System.out.println("X : " + x);
		
		System.out.println("Y : " + y);
		System.out.println("Y : " + (++y));
		System.out.println("Y : " + y);


		x += 5; // x = x + 5;

		System.out.println("X : " + x);

	}
}