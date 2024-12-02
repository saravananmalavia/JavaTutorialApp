import java.util.Scanner;



class Square extends Shape{
	int side;
	
	public Square(){
		side = 10;
	}
	public Square(int side){
		this.side = side;
	}
	public Square(int x, int y){

		super(x,y);
		//System.out.println(" I am in constructor");
		
	}

	public int getSide(){
		return this.side;
	}


	public void readShape(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side");
		side = scanner.nextInt();
	}
	public void findArea(){
		area = side * side;
	}

	public void display(){
		System.out.println("side : " + this.side);
		super.display();
	}

}