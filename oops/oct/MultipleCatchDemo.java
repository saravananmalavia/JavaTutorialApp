class MultipleCatchDemo{


	public static void main(String args[]){

		int a, b, c ;
		int values[] = {10,20,15,40,50};

		a = 100; b = 5;

		try{
				for(int i=0; i < values.length; i++){
					System.out.print( values[i] + " ");
				}

				System.out.println();
				for(int i=0; i < values.length; i++){
					c = a /(b - values[i]);
					System.out.println( c );
				}

				int k = Integer.parseInt("1a");

			}

		    catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException ");
			}

		   catch(ArithmeticException e){
		   		System.out.println("ArithmeticException ");
			}
			catch(Exception e){
				System.out.println("Exception " + e);
			}
			

			System.out.println("End of the Program ");

	}

}		


