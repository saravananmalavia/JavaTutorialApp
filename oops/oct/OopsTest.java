import java.util.*;
class OopsTest{
	

	public static void main(String args[]){
		
	Scanner scanner = new Scanner(System.in);

 		Shape shapeArr [] = new Shape[5];
 		 // int Arr[] = new int[5];

 		int i = 0;

 		GraphicRenderer renderer = new ConsoleRenderer();

 		while(true) {

 			System.out.println("Enter your option : S,C,R or Q");
 			char option = scanner.next().charAt(0);

 			System.out.println("Enter X coordinate");
 			int x = scanner.nextInt();
 			System.out.println("Enter Y coordinate");
 			int y = scanner.nextInt();

 			switch (option) {
 				case 'C':
 						shapeArr[i] = new Circle(x, y);
 						//((Circle)shapeArr[i]).readCircle();
 						shapeArr[i].readShape();
 						shapeArr[i].findArea();
 						shapeArr[i].display();
 						renderer.renderShape(shapeArr[i]);
 						i++;
 						break;

 				case 'S':
 						shapeArr[i] = new Square(x, y);
 						//((Square)shapeArr[i]).readSquare();
 						shapeArr[i].readShape();
 						shapeArr[i].findArea();
 						shapeArr[i].display();
 						renderer.renderShape(shapeArr[i]);
 						i++;
 						break;

 				case 'R':


 				case 'Q':
 						System.exit(0);

			}
		}

	}
}