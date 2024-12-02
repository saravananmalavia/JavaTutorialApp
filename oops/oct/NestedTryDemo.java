class NestedTryDemo{


	public static void main(String args[]){

		int a, b, c ;
		int values[] = {10,20,5,40,50};

		a = 100; b = 5;

		try{
				try{
					for(int i=0; i <= values.length; i++){
						System.out.print( values[i] + " ");
					}
				}catch(ArrayIndexOutOfBoundsException e){
					//System.out.println("Exception " + e);
				}

				System.out.println();
				for(int i=0; i <= values.length; i++){
					try{
						c = a /(b - values[i]);
					
					}
					catch(ArithmeticException e){
					//System.out.println("ArithmeticException " + e);
						c = a /(b);
					}

					System.out.println( c );
				

				}
			}
			catch(Exception e){
					System.out.println("Exception " + e);
			}
	}		

}

