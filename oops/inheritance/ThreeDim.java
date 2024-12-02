import java.util.*;
public class ThreeDim extends TwoDim{
	int height;


	public static void main(String args[]){

		ThreeDim threeDim1 = new ThreeDim(10,20,30);
		threeDim1.display();

		
	}

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

		super.display();
		// System.out.println("Length : " + length);
		// System.out.println("Breadth : " + breadth);
		System.out.println("Height : " + height);
	}



}