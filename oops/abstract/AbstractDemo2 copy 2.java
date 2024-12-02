class AbstractDemo2{
	public static void main(String args[]){
		Circle c1 = new Circle(10);
				c1.findArea();
				c1.displayCircle();
		Square s1 = new Square(10);
				s1.findArea();
				s1.displaySquare();
	}
}
abstract class Shape{
	double area;
	static final double PI = 3.14;
	public abstract void findArea();

	public void displayData(){
		System.out.println("area :" + area);
	}
}

class Circle extends Shape{
	int radius;

	public Circle(int r){
		radius = r;

	}
	
	public void findArea(){
		area = PI * Math.pow(radius,2);
	}

	public void displayCircle(){
		System.out.println("radius :" + radius);
		super.displayData();
	}
	

}
class Square extends Shape{
	int side;
	public Square(int s){
		side = s;
	}
	public void findArea(){
		area = side * side;
	}
	public void displaySquare(){
		System.out.println("side :" + side);
		super.displayData();
	}
	

}