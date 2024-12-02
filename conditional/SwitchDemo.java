class SwitchDemo{
	

	public static void main(String[] args) 
	{	
		int val1,val2,val3=0;

		System.out.print("Enter the value 1 : ");
			val1 = Helper.getI();
		System.out.print("Enter the value 2 : ");
			val2 = Helper.getI();
		System.out.print("Enter the Operation : ");
		String c = Helper.getS();

		switch(c){
			case "+" :
					val3 = val1 + val2;

					System.out.println(" + OPERATION ");
					break;
			case "-":
					val3 = val1- val2;
					System.out.println(" - OPERATION ");
					
					break;
			case "*":
					val3 = val1 * val2;
					System.out.println(" * OPERATION ");

					break;

			default :
					System.out.println("WRONG OPTION");
					break;

		}
					System.out.println("val1 : " + val1);
					System.out.println("val2 : " + val2);
					System.out.println("val3 : " + val3);
		