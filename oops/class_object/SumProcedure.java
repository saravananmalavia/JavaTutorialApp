import java.util.*;
public class SumProcedure {
   public static void main(String args[]) {

   	  Scanner in = new Scanner(System.in);
   	  int input1,input2,result;

      System.out.println("Enter the first input");
      input1 = in.nextInt();

      System.out.println("Enter the second input");
      input2 = in.nextInt();

      result = input1 + input2;

      System.out.println("Input1 : " + input1);
      System.out.println("Input2 : " + input2);
      System.out.println("Result: " + result);

   }
}