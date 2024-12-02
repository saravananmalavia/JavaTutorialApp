import java.util.*;
class ArraySorting{
	public static void main(String args[]){

		int value1;
		value1 = 10;

		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the no elements");
		n = input.nextInt();

		int values[] = new int[n]; // creation
		int sorted[] = new int[n]; // creation

		for(int i=0;i<values.length;i++){
			System.out.println("Enter the " + (i+1) + " element");
			values[i] = input.nextInt();
			sorted[i] = values[i];
		}

		//int values[] = {12,34,56,78,90};

		System.out.println("The given elements are ");

		for(int i=0;i<values.length;i++){
			System.out.print(values[i] + " ");
			
		}


		// code to sort the elements sorted[]

		//sort = input;
		int t;
		for(int i=0;i < sort.length-1;i++){
			for(int j=i+1; j<sort.length;j++){
				if(sort[i] > sort[j]){.          // 10 5
					t = sort[i];  // 10
					sort[i] = sort[j];  // 5
					sort[j] = t;   // 10
				}
			}
		}




		System.out.println("\n The sorted elements are \n");

		for(int i=0;i<n;i++){
			System.out.print(sorted[i] + " ");
			
		}
	}
}

/*
		[0] [1] [2] [3] [4] [5]

		12  56   1   4   78  90 

(0,1)   12  56   1   4   78  90
(0,2)   1  56   12   4   78  90
(0,3)   1  56   12   4   78  90
(0,4)   1  56   12   4   78  90
(0,5)   1  56   12   4   78  90
(1,2)   1  12   56   4   78  90
(1,3)   1  4    56  12   78  90
(1,4)   1  4    56  12   78  90
(1,5)   1  4    56  12   78  90
(2,3)   1  4    12  56   78  90
(2,4)   1  4    12  56   78  90
(2,5)   1  4    12  56   78  90
(3,4)   1  4    12  56   78  90
(3,5)   1  4    12  56   78  90
(4,5)   1  4    12  56   78  90

size n = 6

i = 0 i< n-1
j = i+1 j < n

*/





