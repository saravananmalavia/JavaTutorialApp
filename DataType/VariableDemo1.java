
class VariableDemo1{
	
	 int val2; // instance variable (object)
	 			
	public static void main(String args[]){

			VariableDemo1 obj1 = new VariableDemo1();
		
						obj1.display();
	}

	 public void display(){

	 		int val1 = 0;
			System.out.println("val1 : " + val1);
			System.out.println("val2 : " + val2);

			if(val1 == 0){

				int k = 10;
				System.out.println("k : " + k);
			}

			//System.out.println("k : " + k);
		System.out.println("val1 : " + val1);
	 }
}