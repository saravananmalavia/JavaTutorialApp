class LargestAmongThree{

	public static void main(String args[]){

		int val1,val2,val3;
			val1 = 25; val2 = 35; val3 = 12;
				int largest = 0 ;
			
			if((val1 > val2) && (val1 > val3)){
				
				largest = val1;
			}
			else if(val2 > val3){
			
				largest = val2;
			}
			else{
				largest = val3;
			}
			
			
			// else if((val3 > val1) && (val3 > val2)){
				
			// 	largest = val3;
			// }
			

			System.out.println("val1 : " + val1);
			System.out.println("val2 : " + val2);
			System.out.println("val3 : " + val3);

			System.out.println("largest : " + largest);




	}


}