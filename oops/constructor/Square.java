import java.util.*;
public class Square{
	int side, area;
	public static void main(String args[]){
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		a = in.nextInt();

		Square A1; 
		A1 = new Square(a);
		A1.findArea();
		A1.printArea();
	}

	public Square(int a){
		side = a;
	}

	public void findArea(){
		area = side * side;
	}

	public void printArea(){
		System.out.println(" Length of the sides of Square 	: " + side);
		System.out.println(" Area of Square 				: " + area);
	}
}