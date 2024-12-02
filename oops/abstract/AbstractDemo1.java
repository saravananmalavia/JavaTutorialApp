class AbstractDemo1{
	public static void main(String[] args) {

		
		Square square1 = new Square(10);
		square1.findArea();
		square1.printData();

		Shape shape1 = new Square(5);
		shape1.findArea();
		shape1.printData();

		Circle circle1 = new Circle(10);
		circle1.findArea();
		circle1.printData();

	}
}

abstract class Shape{
	double area;
	static final double PI = 3.14;

	public abstract void findArea();

	public void printData(){
		System.out.println("Area :" + area);
	}

}
class Square extends Shape{

		int side ;
		
		public Square(int side){
				this.side = side;
		}
		public  void findArea(){
			area = side * side;
		}
}

class Circle extends Shape{

		int radius ;
		
		public Circle(int radius){
				this.radius = radius;
		}
		public  void findArea(){
			area = PI * radius * radius;
		}
}




