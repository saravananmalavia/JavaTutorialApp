import java.util.Scanner;

class ArraySorting{
	
	public static void main(String args[]){
		int []input,sort;

		   input = new int[10];
		   sort = new int[10];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the values");
		for(int i=0;i<input.length;i++){
			input[i] = sc.nextInt();
			sort[i] = input[i];
		}

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



		System.out.println("The input values are");
		for(int i=0;i<input.length;i++){
				System.out.print(input[i] + " ");
				
		}
		System.out.println();
		System.out.println("The sorted values are");
		for(int i=0;i<input.length;i++){
				System.out.print(sort[i] + " ");
				
		}
		System.out.println();

	}
}

/*
index   0  1  2  3  4  5  6 
values  5  3  2  6  7  1  3

i j = i+1  

0 1    3  5  2  6  7  1  3
0 2	   2  5  3  6  7  1  3
0 3    2  5  3  6  7  1  3
0 4	   2  5  3  6  7  1  3
0 5    1  5  3  6  7  2  3
0 6    1  5  3  6  7  2  3

1 2    1  3  5  6  7  2  3
1 3    1  3  5  6  7  2  3
1 4    1  3  5  6  7  2  3
1 5    1  2  5  6  7  3  3
1 6    1  2  5  6  7  3  3

2 3    1  2  5  6  7  3  3
2 4    1  2  5  6  7  3  3
2 5    1  2  3  6  7  5  3
2 6    1  2  3  6  7  5  3

3 4    1  2  3  6  7  5  3
3 5    1  2  3  5  7  6  3
3 6    1  2  3  3  7  6  5

4 5    1  2  3  3  6  7  5
4 6    1  2  3  3  5  7  6

5 6    1  2  3  3  5  6  7



*/










