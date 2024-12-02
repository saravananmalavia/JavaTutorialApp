import java.util.Scanner;
class TwoDimArrayDemo{

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int row, col;
		int Matrix1[][];
		int Matrix2[][];
		int Matrix3[][];

		System.out.println("Enter the row and col");

		row = scanner.nextInt();
		col = scanner.nextInt();

		Matrix1 = new int[row][col];
		Matrix2 = new int[row][col];
		Matrix3 = new int[row][col];

		System.out.println("Enter the elements of the first matrix");
		for(int i = 0; i<row; i++){
			for(int j = 0; j< col; j++){
				Matrix1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter the elements of the Second matrix");
		for(int i = 0; i<row; i++){
			for(int j = 0; j< col; j++){
				Matrix2[i][j] = scanner.nextInt();
			}
		}

		Matrix3 = addMatrix(Matrix1,Matrix2);

		System.out.println("The elements of the First matrix");
			displayMatrix(Matrix1);

		System.out.println("The elements of the Second matrix");
			displayMatrix(Matrix2);

		System.out.println(" Matrix1 + Matrix 2");
			displayMatrix(Matrix3);

	}


	public static void displayMatrix(int mat[][]){

		for(int i = 0; i<mat.length; i++){
				for(int j = 0; j < mat[i].length; j++){
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
		}

	}

	public static int[][] addMatrix(int mat1[][],int mat2[][]){

		int mat3[][] = new int[mat1.length][mat1[0].length];

		for(int i = 0; i<mat1.length; i++){
			for(int j = 0; j< mat1[i].length; j++){
				mat3[i][j] = mat1[i][j] + mat2[i][j] ;
			}
		}

		return mat3;
	}


}