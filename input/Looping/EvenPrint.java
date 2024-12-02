import java.util.*;

class EvenPrint{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter the value of n");
		n = sc.nextInt();

		for(int i=1;i<=n;i++){
			if (i % 2 == 0){
				System.out.print(i + " ");
			}
		}

	}
	
}

// n = 50;
// int count =0 ;

// int i = 1;
// do{
// 	if (i % 2 == 0){
// 			System.out.print(i + " ");
// 			count ++;
// 		}

// 	i++;
// }while(count<=n)



