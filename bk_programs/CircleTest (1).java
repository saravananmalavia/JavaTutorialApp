package graphtest;
import graph.Circle;
class CircleTest {

	public static void main(String[] args) {
      	Circle circle1 = new Circle(10, 2, 2);
      	circle1.x = 5;
      	circle1.y = 10;
		System.out.println(circle1.findArea());
		Circle circle2 = new Circle(5, 2, 2);
      	circle2.x = 5;
      	circle2.y = 10;
		System.out.println(circle2.findArea());

	}
}