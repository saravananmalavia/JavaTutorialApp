public class RecursionFact{


  public static void main(String[] args) {
    int result = fact(5);
    System.out.println("Factorial " + result);
  }


  public static int fact(int k) {
    if (k > 1) {
      return k  * fact(k - 1);
    } else {
      return 1;
    }
  }
}

// k = 5
// 5  * fact(4).  5 * 4 * 3 * 2 *1  
// 4  * fact(3)   4 * 3 * 2 *1 
// 3  * fact(2)   3 * 2 *1 
// 2  * fact(1)   2 * 1
// 1







