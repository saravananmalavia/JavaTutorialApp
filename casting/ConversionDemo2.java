class ConversionDemo2{
	
	 public static void main(String args[]) {


	 	Circle c1 = new Circle();
	 	Square s1 = new Square();

	 	Shape shape1 = c1;
	 	Shape shape2 = s1;

	 	Shape shape3 = new Shape();

	 	shape1.display();
	 	shape2.display();
	 	shape3.display();

	 	Circle c2 = (Circle)shape3;

	 	Shape.display();



	 }
}


/*
class Payment{

	public void doPaymnetCard(){

	}
	public void doPaymnetCash(){

	}
}
class AdvancePayment extends Payment
	public void doPaymentUPI(){

	}
}
*/

class Shape{
	double area;

	public void display(){
		System.out.println("Shape class");
	}
}
class Circle extends Shape{
	double radius;
	public static void display(){
		System.out.println("Circle class");
	}

}

class Square extends Shape{
	int side;

	public static void display(){
		System.out.println("Square class");
	}

}

