import java.util.Scanner;
class TwoDimArrayDemo{

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int row, col;
		int Matrix[][];

		System.out.println("Enter the row and col");

		row = scanner.nextInt();
		col = scanner.nextInt();

		Matrix = new int[row][col];

		System.out.println("Enter the elements of the matrix");
		for(int i = 0; i<row; i++){
			for(int j = 0; j< col; j++){
				Matrix[i][j] = scanner.nextInt();
			}
		}

			System.out.println("The elements of the matrix");
			for(int i = 0; i<row; i++){
				for(int j = 0; j< col; j++){
					System.out.println(Matrix[i][j]);
				}
		}




	}



}