// compile time poly
// early binding 

class MethodOverLoadingDemo{

		public static void main(String args[]){

			Shape.findArea(5.0);
			Shape.findArea(5);
			Shape.findArea(2,3);

		}
	
}

class Shape{


	public static void findArea(double r){

		double area = Math.PI * Math.pow(r,2);
		System.out.println("The area of the circle is " + area);

	}
	

	public static void findArea(int s){

		double area = s * s;
		System.out.println("The area of the square is " + area);
		
	}

	public static void findArea(int l,int b){
		double area = l * b;
		System.out.println("The area of the rectancle is " + area);
		
	}


}