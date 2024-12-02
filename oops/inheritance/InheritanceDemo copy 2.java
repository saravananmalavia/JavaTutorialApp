class InheritanceDemo{
		public static void main(String args[]){
			TwoDim twoDim1 = new TwoDim(10,20);
			twoDim1.display();

			ThreeDim threeDim1 = new ThreeDim(100,200,300);
			//threeDim1.print();
			threeDim1.display();

		}
	
}

class TwoDim{
	int length;
	int breadth;

	public TwoDim(){

	}
	public TwoDim(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
		
	}
	public void display(){

		System.out.println("length : " +length);
		System.out.println("breadth : " + breadth);
	}

}
class ThreeDim extends TwoDim{
	int height;
	public ThreeDim(){


	}
	public ThreeDim(int length,int breadth,int height){
		// this.length = length;
		// this.breadth = breadth;

		super(length,breadth); // invoke the base class constructor
							   // very first statment in the constructor
		
		this.height = height;
	}

	public void display(){

	//public void print(){

		// System.out.println("length : " +length);
		// System.out.println("breadth : " + breadth);
		super.display(); // calls the base class method
		System.out.println("height : " + height);
	}
}











