import java.util.*;
class TwoDimArray{
	public static void main(String args[]){

		// int Mat[][];  // declartion
		// Mat = new int[2][2]; // creation

		//  int Mat[][] =   new int[2][2]; 

		// Mat[0][0] = 10;
		// Mat[0][1] = 20;
		// Mat[1][0] = 30;
		// Mat[1][1] = 40;

		int Mat[][] = {{10,20},{30,40,50},{10},{1, 2, 3 ,4, 5}};

		System.out.println("Mat.length :" + Mat.length );
		System.out.println("Mat[0].length :" + Mat[0].length );
		System.out.println("Mat[1].length :" + Mat[1].length );
		System.out.println("Mat[2].length :" + Mat[2].length );

		for(int row = 0;row < Mat.length; row++){
				for(int col=0; col < Mat[row].length; col++){

					System.out.print(Mat[row][col] + " ");
				}
				System.out.println();
		}

	}
}

no rows

int jArray[][] = int [rows][];

jArray[0] new int[3];
jArray[1] new int[2];





/*
10 20 

30 40 50

10

1 2 3 4 5

*/

