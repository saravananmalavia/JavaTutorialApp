import java.util.Scanner;

public class SingleDigitSumFunction {
public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    int N,n,singleDigitSum;
    System.out.println("Enter the value N");
    N = input.nextInt();
    n = N;
   
//digitSum = 0;

    do{
         
           singleDigitSum = findDigitSum(n);

             n = singleDigitSum;
         System.out.println("digitSum : " + singleDigitSum);
      }while(singleDigitSum >= 10);


    System.out.println( "The Single Digit sum of  " + N  + " is " + singleDigitSum);
  }

  public static int findDigitSum(int value){

        int digitSum,lastDigit;
        digitSum = 0;
            do{
                lastDigit =  value % 10;
                digitSum = digitSum + lastDigit ;
                value =value / 10;
            }while(value > 0);

        return digitSum;

  }


}

