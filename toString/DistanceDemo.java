class DistanceDemo{

	public static void main(String args[]){
		Distance distance1 = new Distance(10,6);
		Distance distance2 = new Distance(20,7);
		Distance distance3 = new Distance(30,8);

		String sampleTest = "Result : \n" +distance3;

		System.out.println(distance1);
		System.out.println(distance2);
		System.out.println(distance3);
		System.out.println(sampleTest);

	}
	
}

class Distance{
	int feet;
	int inches;

	public Distance(){

	}
	public Distance(int feet, int inches){
		this.feet = feet;
		this.inches = inches;
	}

	public  String toString(){

		String output = "";

		output += "Feet   : " + feet + "\n";
		output += "Inches : " + inches + "\n";
		output += "*******###**********" + "\n";

		return output ;



	}


}

















