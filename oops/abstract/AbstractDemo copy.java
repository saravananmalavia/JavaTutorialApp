
class AbstractDemo{
	public static void main(String args[]){

		Square square1 = new Square(5);
		Rectancle rectancle1 = new Rectancle(5,10);
		Circle circle1 = new Circle(10);
		
		square1.findArea();
		rectancle1.findArea();
		circle1.findArea();

		square1.display();
		rectancle1.display();
		circle1.display();


	}

}

abstract class Shape{
	double area;
	static final double PI = 3.14;

	public abstract void findArea();
	
	public void display(){
		System.out.println("area :" + area);	
	}
	
}



 class Square extends Shape{
	int side;

	public Square(int s){
		side=s;
	}
	public  void findArea(){
		area = side * side;
	}
	public void display(){
		System.out.println("side :" + side);
		super.display();	
	}
	
	

}
class Rectancle extends Shape{
	int length;
	int breadth;


	public Rectancle(int l,int b){
		this.length = l;
		this.breadth = b;
		super.display();
	}

	public  void findArea(){
		area = length * breadth;
	}

	public void display(){
		System.out.println("length :" + length);	
		System.out.println("breadth :" + breadth);	
		super.display();
	}
	


}
class Circle extends Shape{
	int radius;
	

	public Circle(int r) {
		this.radius = r;
	}
	public  void findArea(){
		area = PI * Math.pow(radius,2);
	}

	public void display(){
		System.out.println("radius :" + radius);
		super.display();	
		
	}


}


