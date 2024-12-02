import java.util.*;
public class TwoDim{

	int length,breadth;

	public static void main(String args[]){
		TwoDim twoDim1 = new TwoDim();
		twoDim1.readTwoDim();
		twoDim1.display();

		
	}
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
		System.out.println("Length : " + length);
		System.out.println("Breadth : " + breadth);
		//System.out.println("Height : " + height); error
	}
}