class ExceptionDemo1{

	public static void main(String args[]){
		int sum = 0;
		int x,y = 2;
		for(int i=0;i<=args.length;i++){
			   try{
					sum += Integer.parseInt(args[i]);
					try{
						x = sum /y ;
						y--;
					}
					catch(ArithmeticException e){
						//System.out.println(e.getMessage());
					//	System.out.println("I am in inner try");
					}

					System.out.println(" Hello");
				}

				catch(NumberFormatException e){
						//System.out.println(e.getMessage());
					System.out.println("I am from catch block 1");
				}
				catch(ArrayIndexOutOfBoundsException e){
						//System.out.println(e.getMessage());
					System.out.println("I am from catch block 2");
				}
				catch(Exception e){
						//System.out.println(e.getMessage());
					System.out.println("I am from Main catch");
				}
				
				finally{
					//System.out.println("I am from finally block");
				}		
		}

		for(String val: args){
			System.out.print(" " + val);
		}

		System.out.println("sum : " + sum);

	}
	
}

























