import java.util.*;
public class FunctionOverridingDemo{
	public static void main(String[] args){  
			 
			 TwoDim twoDimObj1 = new TwoDim(10,20);
			 ThreeDim threeDimObj1 = new ThreeDim(10,20,30);
			 twoDimObj1.display();

			 threeDimObj1.display();
			
		}
}

class TwoDim{

	int length,breadth;
	public TwoDim(){
		System.out.println("I am in base constructor");
	}
	public TwoDim(int length,int breadth){
		System.out.println("I am in base constructor");
		this.length = length;
		this.breadth = breadth;
	}
	public void readTwoDim(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		length = in.nextInt();
		System.out.println("Enter the Breadth : ");
		breadth = in.nextInt();
	}
	public void display(){
		// System.out.println("Two Dim");
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
		//System.out.println("Height : " + height); error
	}
}
class ThreeDim extends TwoDim{
	int height;

	public ThreeDim(){
		super(); // it should be the very first statement 
		//in  sun class constrructor
		System.out.println("I am in sub constructor");
		
	}

	public ThreeDim(int height){
		this.height = height;
	}

	public ThreeDim(int length,int breadth,int height){
		super(length,breadth);
		System.out.println("I am in sub constructor");
		this.height = height;
	}

	public void readThreeDim(){
		super.readTwoDim();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Height : ");
		height = in.nextInt();
		
	}
	public void display(){

		
		System.out.println("Three Dim");
		 super.display();
		// System.out.println("Length : " + length);
		// System.out.println("Breadth : " + breadth);
		System.out.println("Height : " + height);
	}



}

