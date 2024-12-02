package utility; // very first statement in the program 

public class Calculator{
	public static void main(String args[]){
		Calculator.add(10,20);
	}
	public static void add(int i1,int i2){
		System.out.println("Sum : " + i1 + "," + i2 + " = " +(i1+i2));

	}
	public static void multiply(int i1,int i2){
		System.out.println("Mul : " + i1 + "," + i2 + " = " +(i1*i2));

	}
}