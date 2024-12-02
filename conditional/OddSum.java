import java.util.Scanner;
public class OddSum {
	public static void main(String args[]) {
		int n,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		n = sc.nextInt();
		sum = 0;
		for(int i = 1;i<=n;i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("n :"+ n);
		System.out.println("sum :"+ sum);
	}
}