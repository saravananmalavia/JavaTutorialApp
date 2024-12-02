public class ConditionalDemo2{
	public static void main(String[] args){
		int x = 5;
		int y = 10;
        // nested if (if with in another if)
		if(x == 5)
		{
			System.out.println("x is FIVE");
			if(y > 5)
				{
					//System.out.println("x is FIVE");
					System.out.println("y is greater than FIVE");
					
				}
				else{
					//System.out.println("x is FIVE");
					System.out.println("y is not greater than FIVE");
				}


		}
		else{
			System.out.println("x is NOT FIVE");
		}
		
		System.out.println("I am after if");
	
	}

}













