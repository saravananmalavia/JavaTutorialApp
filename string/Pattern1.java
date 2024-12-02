import java.util.*;
public class Pattern1 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int n,fact;
		System.out.println("Enter the value N");
		n = input.nextInt();

		for(int i=1; i<=n; i++ ){
			for(int j=1; j<=n; j++ ){
				System.out.print(" *");
				if(i == j){
					break ;
				}
			}
			System.out.println();
		}
		

	}
}

/*

*
* *
* * *
* * * *
* * * * * 

*/

