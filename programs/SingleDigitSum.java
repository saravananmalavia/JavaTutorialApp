class SingleDigitSum{


	public static void main(String args[]){

		int number,n,lastDigit;
		int digitSum = 0;  

		// 123  = 1+2+3 = 3+2+1 (12) (1) >0
		// digitSum += 3 + 2 + 1

		//123 % 10 = 3 12 % 10 = 2  = 1%10 = 1 

		System.out.print("Enter the number : ");
		number = Helper.getI();
		n = number;

		do{
			digitSum = SingleDigitSum.findDigitSum(n);
			n = digitSum;
		}while(digitSum >= 10);

		Helper.sop("SingleDigitSum of " + number + " is " +digitSum);
	
	}

	public static int findDigitSum(int n){

		int lastDigit;
		int digitSum = 0; 

			do{
				lastDigit = n % 10;
				digitSum += lastDigit;
				n = n / 10;
			}while(n>0);

			return digitSum;
	}

}