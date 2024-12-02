import java.util.*;
class Circle{
	int radius;
	double area;
	static double PI = 3.14;

	public static void main(String args[]) {

		Circle circle1 = new Circle();
		circle1.readCircle();
		circle1.findArea();
		circle1.displayCircle();

		Circle c2,c3; // declartion

		c2 = new Circle();
		c3 = new Circle();

		c2.readCircle();
		c2.findArea();
		c2.displayCircle();


		c3.readCircle();
		c3.findArea();
		c3.displayCircle();

	}
	


	public void readCircle(){
		Scanner in = new Scanner(System.in);
      	System.out.println("Enter the radius of the circle");
      	radius = in.nextInt();
	}

	public void findArea(){
		area = PI * Math.pow(radius,2);
		
	}
	public void displayCircle(){
	  System.out.println("********CIRCLE*********");
	  System.out.println("radius : " + radius);
      System.out.println("area : " + area);
      System.out.println("*************************");
	}


}