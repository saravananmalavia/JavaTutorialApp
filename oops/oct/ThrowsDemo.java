class ThrowsDemo{
	
	public static void main(String args[]){
		int result = 0 ;
		
		try{
			result = Bank.operation(5,5);
			
		}
		catch(Exception e){
			System.out.println("Exception occoured");
		}
		System.out.println("Result : " + result);
		

	}
}


class Bank{

	public static int  operation(int x,int y)throws Exception{

		//int result = Calculator.calculate(x,y);	

		int result =0;
		try{
				result = Calculator.calculate(x,y);	
				
		}
		catch(Exception e){

		}
		return result;
	}
}



class Calculator{

	public static int calculate(int a, int b)throws Exception
	{

		int c = a + b ;
		int d = 100/(c - 10);
		return d;
	}
}