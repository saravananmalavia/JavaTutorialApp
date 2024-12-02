import java.util.*;

class AbstractShapeDemo{
	public static void main(String args[]){
		Square square1 = new Square(10);
		Circle circle1 = new Circle(10);
		Rectangle rectangle1 = new Rectangle(10,10);
		square1.findArea();
		circle1.findArea();
		rectangle1.findArea();

		Square square1 = new Square();
		square1.readData();

	}

}

abstract class Shape{
	double area;
	static double PI = 3.14;
	public abstract void findArea();

}

class Square extends Shape{
	int side;
	public Square(int side){
		this.side = side;
	}
	public void findArea(){
		area = side * side;
		System.out.println("    Square");
		System.out.println("***************");
		System.out.println("Side : " + side);
		System.out.println("Area : " + area);
	}


}
class Circle extends Shape{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public void findArea(){
		area = PI * Math.pow(radius,2);
		System.out.println("    CIRCLE");
		System.out.println("***************");
		System.out.println("Radius : " + radius);
		System.out.println("Area : " + area);

	}


}
class Rectangle extends Shape{
	int length;
	int breadth;
	public Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public void findArea(){
		area = length * breadth;
		System.out.println("    Rectangle");
		System.out.println("***************");
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
		System.out.println("Area : " + area);

	}

}


// Shape class add a display method to display raea alone
// Shape class readData abstract method
// implement the readData method in all shapes curcle,square and rectangle
// introduce a no parametric constructor in all class
// should use package
// should use Helper class getI() to read the int , getD() 



