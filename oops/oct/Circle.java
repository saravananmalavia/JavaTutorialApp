import java.util.Scanner;


class Circle extends Shape{
	
	double radius;
	
	public Circle(){
		radius = 20.0;
	}

	public  Circle(double radius){
		this.radius = radius;
	}

	public  Circle(int r1){
		radius = r1;
	}

	public Circle(int x, int y){
		super(x,y);
		//System.out.println(" I am in constructor");
		
	}

	public double getRadius(){
		return this.radius;
	}

	public void readShape(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = scanner.nextDouble();
	}
	public void findArea(){
		area = Math.PI * Math.pow(radius,2);
	}

	public void display(){
		System.out.println("radius : " + this.radius);
		super.display();
	}

}