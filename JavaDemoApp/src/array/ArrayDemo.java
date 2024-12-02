class ArrayDemo{
	public static void main(String args[]){

		//int mark;
		//mark   = 10;


		//1. declarion

		int values[];

		//2. creation 

		values = new int[5];

		declarion + creation

	    int values[] = new int[5];

		// int v1, v2, v3, v4, v5; 

		// v1 = 10; 
		// v2 = 20;

		//3. initialize 

		 values[0] = 10;
		 values[1] = 20;
		 values[2] = 30;
		 values[3] = 40;
		 values[4] = 50;

		 // values[5] = 50;
		
		//values[5] = 50; error (index)

//		declarion + creation + intialization


		  int values[] = {10,20,30,40,50};

	  //   System.out.println("Array size  :" + values.length);

		// for(int i = 0;i < values.length;i++){
		// 	System.out.println(values[i]);		
		// }

	 //    values[0] += 100;

		// System.out.println(values[0]);	

		// for(int ele : values){
		// 	System.out.println(ele);
		// }


		//System.out.println(values.length);


		//   int x[], y, z ; // x - array , y and z int variables 

		//   int []x, y, z ; // x y z are treated as array


		//    x = new int [5];
		//   // y = new int [5];
		//   // z = new int [5];
		//    y = 10;
		// System.out.println(x.length);
		//System.out.println(y.length);
		//System.out.println(z.length);

		// int matrix[][];
		// matrix = new int[3][4];
		// matrix[0][0] = 1;
		// matrix[0][1] = 2;

		// matrix[2][3] = 2;


	//	int matrix[][] = new int[3][4];

		int matrix[][] = { {1,2,3,4},
						   {5,6,7,8},
						   {9,10,11,12}
						  };

			for(int row=0;row<3;row++){
				for(int col=0;col<4;col++){
					//System.out.print("["+row + "," + col +"]" + " ");

					System.out.print(matrix[row][col] + "  ");
				}
				System.out.println();
				
		 	}



		/*

			matrix[0][0] = 1
			matrix[0][1] = 2
			matrix[2][1] = 10

		

		/* 3 X 4

		1  2  3  4
		5  6  7  8
		9 10 11 12
		
	     0	     1     2     3
	0	[0,0] [0,1] [0,2] [0,3]
	1	[1,0] [1,1] [1,2] [1,3]
	2	[2,0] [2,1] [2,2] [2,3]
		
		*/

		//	park[0][0]

		// park[0] = 1
		// park[1] = 0
		// park[2] = 1 
		// park[3] = 0
		// park[4] = 1
	

		


	}
}

