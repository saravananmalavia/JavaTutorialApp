import java.util.*;
public class SumOOPS {

    int input1,input2,result; // data members


   public static void main(String args[]) {

      SumOOPS sum1 = new SumOOPS();
      sum1.readValue();
      sum1.findSum();
     

      SumOOPS sum2 = new SumOOPS();
      sum2.readValue();
      sum2.findSum();

      sum1.displaySum();
      sum2.displaySum();

   
   }

   // member functions

  public void readValue(){

      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first input");
      this.input1 = in.nextInt();
      System.out.println("Enter the second input");
      input2 = in.nextInt();
   }

      //this -- current Object (the object by in which method is called)

 
      // member functions

    public void findSum(){
      result = input1 + input2;
   }

      // member functions
   public void displaySum(){
   
      System.out.println("Input1 : " + input1);
      System.out.println("Input2 : " + input2);
      System.out.println("Result: " + result);
   }


  





}