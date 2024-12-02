import java.util.*;

public class OperatorDemo7{
	public static void main(String xyz[]){ 

		Scanner in = new Scanner(System.in);

		int x ;
		int y ;
		System.out.println("enter the value of x ");
		x = in.nextInt();
		System.out.println("enter the value of y ");
		y = in.nextInt();


		int z,z1;

		if(x > y){
			z = x;
		 }else{
		 	z = y;
		 }

		 z1 = (x>y) ? x : y;  // ternary operator

		

			System.out.println("~~~~~~~~~~");
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			System.out.println("z : " + z);
			System.out.println("z1 : " + z1);
			System.out.println("~~~~~~~~~~");




		int a = 100; int b = 200; int c = 30;

		int greater = ((a>b) && (a>c)) ? a : (b>c)? b : c;

			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("greater : " + greater);


		

		
	}
}