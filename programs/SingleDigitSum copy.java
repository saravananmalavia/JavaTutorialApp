import java.util.Scanner;

public class SingleDigitSum {
public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    int N,n,digitSum,lastDigit;
    System.out.println("Enter the value N");
    N = input.nextInt();
    n = N;
   
digitSum = 0;

    do{
        // digitSum = 0;
            do{
                lastDigit =  n % 10;
                digitSum = digitSum + lastDigit ;
                n = n / 10;
            }while(n>0);

            n = digitSum;
            System.out.println("digitSum : " + digitSum);
      }while(digitSum >= 10);

    

   



    System.out.println( "The Single Digit sum of  " + N  + " is " + digitSum);
  }
}

