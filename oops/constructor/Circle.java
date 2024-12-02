import java.util.*;
class Circle{
	int radius;
	double area;
	static double PI = 3.14;

	public static void main(String args[]) {

		Circle circle1;
		circle1 = new Circle();
		circle1.findArea();
		circle1.displayCircle();

		// Circle circle2;
		// circle2 = new Circle();
		// circle2.readCircle();
		// circle2.findArea();
		// circle2.displayCircle();
		

		Circle circle3;
		circle3 = new Circle(5);
		circle3.findArea();
		circle3.displayCircle();

	}
	
	public Circle(){
		System.out.println("I am with in constructor");
		radius = 2;
	}
	public Circle(int r){ // parametric constructor
		System.out.println("I am with in parametric constructor");
		radius = r;
	}
	// public Circle(double r){ // parametric constructor
		
	// }
	// public Circle(int r1,int r2){ // parametric constructor
		
	// }
	// public Circle(int r1,double r2){ // parametric constructor
		
	// }
	// public Circle(double r1,int r2){ // parametric constructor
		
	// }


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