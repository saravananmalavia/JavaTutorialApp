import java.util.*;
public class Distance{
	int feet,inches;

	public static void main(String args[]){
		
		Distance distance1 = new Distance();
		Distance distance2 = new Distance(7,10);
		// Distance distance3 = new Distance();
		// distance3.readDistance();

		System.out.println("Distance D1");
		System.out.println("************");
      
		distance1.displayDistance();
		System.out.println("Distance D2");		
		System.out.println("************");
		distance2.displayDistance();
		// distance3.displayDistance();

		Distance distance4,distance5 ;
		distance4 = new Distance();

		distance0 = Distance.addDistance(distance1,distance2);

		distance4.addDistance(distance1,distance2);
		
		distance5 = distance1.addDistance(distance2);

		//distance4 = Distance.addDistance(distance1,distance2);

		System.out.println("D4 = Distance D1 + D2");		
		System.out.println("**********************");

		// distance4 = Distance.addDistance(distance1,distance2);
		distance4.displayDistance();


		System.out.println("D5 = Distance D1 + D2");		
		System.out.println("**********************");

		distance5.displayDistance();

		// distance5 = Distance.diffDistance(distance1,distance2);
		// distance5.displayDistance();


		// distance4 = Distance.addDistance(distance1,distance2);

	



	}
	public Distance(){
		feet = 10;
		inches = 8	;
	}

	public Distance(int f,int i){
		feet = f;
		inches = i;
	}

	public void readDistance(){
		Scanner in = new Scanner(System.in);
      	System.out.println("Enter the feet");
      	feet = in.nextInt();
      	System.out.println("Enter the inches");
      	inches = in.nextInt();

	}
	public void displayDistance(){
		System.out.println("Feet : " + feet);
		System.out.println("Inches : " + inches);
	}

	// public static Distance addDistance(Distance d1,Distance d2){

	// 	Distance resultDistance = new Distance();

	// 	resultDistance.feet = d1.feet + d2.feet;
	// 	resultDistance.inches = d1.inches + d2.inches;

	// 	if(resultDistance.inches >= 12){
	// 		resultDistance.feet ++;
	// 		resultDistance.inches -= 12;
	// 	}

	// 	return resultDistance;
		
	// }


	public  void addDistance(Distance d1,Distance d2){
		this.feet = d1.feet + d2.feet;
		this.inches = d1.inches + d2.inches;

		if(this.inches >= 12){
			this.feet ++;
			this.inches -= 12;
		}

	}



	public Distance addDistance(Distance d2){

		Distance resultDistance = new Distance();

		resultDistance.feet = this.feet + d2.feet;
		resultDistance.inches = this.inches + d2.inches;

		if(resultDistance.inches >= 12){
			resultDistance.feet ++;
			resultDistance.inches -= 12;
		}

		return resultDistance;
		
	}





}

// d1 12. 7
// d2. 5. 5

// d3. 17 12 -- >(18 0)








