package graphtest;
import graph.*;
import java.util.*;

class CircleTest {

	public static void main(String[] args) {
      	/*Circle circle1 = new Circle(10, 2, 2);
      	circle1.x = 5;
      	circle1.y = 10;
		System.out.println(circle1.findArea());
		Circle circle2 = new Circle(5, 2, 2);
      	circle2.x = 5;
      	circle2.y = 10;
		System.out.println(circle2.findArea());
 		*/
 		Scanner scanner = new Scanner(System.in);
 		Shape shapeArr [] = new Shape[10];
 		//System.out.println(shapeArr[0].getX());
 		int i = 0;
 		GraphicRenderer renderer = new ConsoleRenderer();
 		while(true) {
 			System.out.println("Enter your option : S,C, R or Q");
 			char option = scanner.next().charAt(0);
 			System.out.println("Enter X coordinate");
 			int x = scanner.nextInt();
 			System.out.println("Enter Y coordinate");
 			int y = scanner.nextInt();
 			switch (option) {
 				case 'C':
 						System.out.println("Enter Radius");
 						int radius = scanner.nextInt();
 						shapeArr[i] = new Circle(radius, x, y);
 						System.out.println("Circle area = " + shapeArr[i].calculateArea());
 						renderer.renderShape(shapeArr[i]);
 						i++;
 						break;

 				case 'R':
 						System.out.println("Enter Length");
 						int length = scanner.nextInt();
 						System.out.println("Enter Breadth");
 						int breadth = scanner.nextInt();
 						shapeArr[i] = new Rectangle(length, breadth, x, y);
 						System.out.println("Rectangle area = " + shapeArr[i].calculateArea());
 						renderer.renderShape(shapeArr[i]);
 						i++;
 						break;

 				case 'S':


 				case 'Q':
 						System.exit(0);

			}
		}


	}
}