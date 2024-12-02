package keltron.matrix;
import keltron.util.*;

public class MatrixOperation{
	public static void main(String args[])
       {
       	int row1,col1,row2,col2;

       	Matrix matrix1,matrix2,matrix3; 

       	System.out.println("Enter the row of First Matrix");
       	row1 = Helper.getI();
       	System.out.println("Enter the col of First Matrix");
       	col1 = Helper.getI();
       	matrix1 = new Matrix(row1,col1);
       	matrix1.readMatrix();


       	System.out.println("Enter the row of Second Matrix");
       	row2 = Helper.getI();
       	System.out.println("Enter the col of Second Matrix");
       	col2 = Helper.getI();
       	matrix2 = new Matrix(row2,col2);
       	matrix2.readMatrix();


       	System.out.println("First Matrix");
       	matrix1.displayMatrix();
       	System.out.println("Second Matrix");
       	matrix2.displayMatrix();


       	matrix3 = new Matrix(row1,col1);


       	matrix3.addMatrix(matrix1,matrix2);

       	System.out.println("Resultant Matrix");
       	matrix3.displayMatrix();










       }
	
}