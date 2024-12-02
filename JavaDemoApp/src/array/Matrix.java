package keltron.matrix;
import keltron.util.*;
public class Matrix{
	int row,col;
	int values[][];

	public Matrix(){
		values = new int[row][col];
	}

	public Matrix(int row,int col){
		this.row = row;
		this.col = col;
		values = new int[row][col];
	}

	public void readMatrix(){
		System.out.println("Enter the matrix elements");
		System.out.println("*************************");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				values[i][j] = Helper.getI();
			}
		}

	}
	public void displayMatrix(){

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(values[i][j] + " "); 
			}
			System.out.println();
		}

	}

	public void addMatrix(Matrix m1,Matrix m2){

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				this.values[i][j] = m1.values[i][j] + m2.values[i][j];
			}
		}

	}



}





