public class RecursionSum {


  public static void main(String[] args) {
    int result = sum(5);
    System.out.println(result);
  }


  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }


}

// k = 5

// 5 + sum(4) (5 + 10 = 15)
// 4 + sum(3) (4 + 6 = 10)
// 3 + sum(2) (3 + 3 = 6)
// 2 + sum(1) (2 + 1 = 3)
// 1 + sum(0) (1 + 0 = 1)
// 

