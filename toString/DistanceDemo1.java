class DistanceDemo{

	public static void main(String args[]){
		Distance distance1 = new Distance(10,11);
		Distance distance2 = new Distance(20,11);
		Distance distance3 = new Distance();
		Distance distance4 = new Distance();

		// 10   11
		// 20   19

		// 30 - 24 2

		distance3 = distance1.addDistance(distance2);
		distance3 = Distance.addDistance(distance1,distance2);



		System.out.println("Distance 1");
		System.out.println(distance1);
		
		System.out.println("Distance 2");
		System.out.println(distance2);

		System.out.println("Distance 3");
		distance3.addDist(distance1,distance2);
		System.out.println(distance3);




		//distance4.diffDist(distance1,distance2);

		//System.out.println(distance4);


	
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

	public Distance addDistance(Distance d2){

		Distance d3 = new Distance();


		d3.feet = this.feet + d2.feet;            
		d3.inches = this.inches + d2.inches;  

			if(d3.inches>=12){
				d3.feet ++;
				d3.inches -= 12;
			}


			// d3.feet = d3.feet + (d3.inches/12)
			// d3.inches = d3.inches % 12;
		
		return d3;
			

	}

	public static Distance addDistance(Distance d1,Distance d2){

		Distance d3 = new Distance();


		d3.feet = d1.feet + d2.feet;            
		d3.inches = d1.inches + d2.inches;  

			if(d3.inches>=12){
				d3.feet ++;
				d3.inches -= 12;
			}
		
		return d3;
			

	}


	public void addDist(Distance d1,Distance d2){

		feet = d1.feet + d2.feet;            
		inches = d1.inches + d2.inches;  

			if(inches>=12){
				feet ++;
				inches -= 12;
			}
		
	
	}

	// public  String toString(){

	// 	String output = "";
	// 	output += "Feet   : " + feet + "\n";
	// 	output += "Inches : " + inches + "\n";
	// 	output += "********************" + "\n";
	// 	return output ;
	// }


}

















