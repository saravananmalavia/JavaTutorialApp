import java.util.*;
public class ArmStrongNumber {
   public static void main(String args[]) {
      int number ;

      int check, rem, sum = 0;

      System.out.println("Enter the number to be verified:");
      Scanner in = new Scanner(System.in);
      number = in.nextInt();


      check = number;

      while(check != 0) {

         rem = check % 10;
       //  sum = sum + (rem * rem * rem);
         sum = sum + (int)Math.pow(rem,3); // Math.pow(2,9);
         check = check / 10;

      }
      if(sum == number)
         System.out.println("Given number is an armstrong number.");
      else
         System.out.println("Given number is not an armstrong number.");
   }
}
/*
n= 123;
   p = 0 ;
     do{
       
         n = n / 10;
         ++p ;

      }while(n>0);

   */
























