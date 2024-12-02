class JaggedArray{
		public static void main(String[] args){
			// int jagged[][] = new int[4][];
			// jagged[0] = new int[2];
			// jagged[1] = new int[4];
			// jagged[2] = new int[1];
			// jagged[3] = new int[5];

			int jagged[][] ={{1,2},{1,2,3},{1,2},{1,2,3,4}};

			System.out.println("jagged[0] : "+ jagged[0].length);
			System.out.println("jagged[1] : "+ jagged[1].length);
			System.out.println("jagged[2] : "+ jagged[2].length);
			System.out.println("jagged[3] : "+ jagged[3].length);
			// System.out.println(jagged[0][0]); 
			// System.out.println(jagged[0][1]); 
			// //System.out.println(jagged[2][3]); 
			// System.out.println(jagged[3][0]); 
			// System.out.println(jagged[3][3]); 

			for(int i=0;i<jagged.length;i++){
				
				for(int j=0;j<jagged[i].length;j++){
				   System.out.print(jagged[i][j] + " "); 
				}
				System.out.println();
			}

		}
}
/*
2 Dim Array (3X3)
1 2 3
2 3 4
1 4 6

Jagged Array
(2 dimetional array with dynamic no of coloums)

1 2
1 2 3 4
1
1 2 3 4 5 
*/


