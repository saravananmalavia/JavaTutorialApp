public class ScopeDemo2{
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

   } // The block ends here

    //  System.out.println(x);
  // Code here CANNOT use x


    // for (int x =10;x<20 ;x++ ) {
    //     System.out.print(x + " ");
    // }

    //  for (int x =100;x<1000 ;x+=100 ) {
    //        System.out.print(x + " ");
    // }


      for (int x =100;x<1000 ;x+=100 ) {
           System.out.print(x + " ");

             for (int x =100;x<1000 ;x+=100 ) {
           System.out.print(x + " ");
      }
    }



  }
}