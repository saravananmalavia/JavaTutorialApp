public class StaticDemo3{
	public static void main(String args[]){
		System.out.println("PI :" + MathDemo.PI);

		MathDemo mathDemo = new MathDemo(); 

		// Math.pow(10,2)

		System.out.println("square of 10.0 :" + MathDemo.square(10.0));

		//System.out.println("square of 10.0 :" + MathDemo.square(10.0));
	}
}