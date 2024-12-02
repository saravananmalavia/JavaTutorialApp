class MatrixOperation{
	public static void main(String[] args){
		int MatA[][] = {{1,2,3},{4,5,6}};
		int MatB[][] = {{1,2},{3,4},{5,6}};

		int row1 = MatA.length;
		int col1 = MatA[0].length;
		int row2 = MatB.length;
		int col2 = MatB[0].length;

		// row1 == col2 and row2 == col1

		int MatC[][] = new int[row1][col2];

		for(int i=0;i<row1;i++){
			for(int j=0;j<col2;j++){
				for(int k=0;k<row2;k++){

					MatC[i][j] += MatA[i][k]*MatB[k][j];

				}
			}
		}

		for(int i=0;i<row1;i++){
			for(int j=0;j<col2;j++){
				System.out.print(MatC[i][j] + " "); 
			}
		System.out.println();
		}
	}
}



/*
MatA  (2X3)    

1 2 3
4 5 6

MatB (3X2)

1 2
3 4
5 6
     2x2 
   
(1*1+2*3+3*5) (1*2+2*4+3*6)
(4*1+5*3+6*5) (4*2+5*4+6*6)
22 28
49 64
*/





















