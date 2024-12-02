package graph;
public class Rectangle extends Shape {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth, int x, int y) {
		super(x, y);
		this.length = length;
		this.breadth = breadth;
	}
	public double calculateArea() {
		return this.length * this.breadth;
	}
}


/*Shape shape1 = new Rectangle();
Shape shape2 = new Circle();

if(shape1 instanceof Circle) {

	System.out.println("Rectangle");
			
}else if(shape1 instanceof Rectangle){
	System.out.println("Circle");
}
*/


