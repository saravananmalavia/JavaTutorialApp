package keltron.sms;
import keltron.util.*;
import java.io.Serializable;
public class Student implements Serializable{
	int registerNumber;
	String studentName;
	int marks[] = new int[3];
	String result;
	int total;
	double average;

	static  int PASS_MARK;

	static{
		PASS_MARK = 50;
	}

	public Student(){
		
	}

	public Student(int registerNumber,String name,int mark[]){
		this.registerNumber = registerNumber;
		studentName = name;
		marks = mark;	
		PASS_MARK = 50;
		System.out.println("I am from param constructor");

	}

   public int getRegisterNumber(){
   		return registerNumber;
   }


	public void readStudent(){

		System.out.print("Enter the Register Number :");
		registerNumber = Helper.getI();
		System.out.print("Enter the Name :");
		studentName = Helper.getS();
		for(int i=0;i<marks.length;i++){
			System.out.println("Enter Subject " + (i+1) + " mark :");
			marks[i] = Helper.getMark();
		}
		
	}

	// public void updateStudent(){

	// 	System.out.print("Enter the Name :");
	// 	studentName = Helper.getS();
	// 	for(int i=0;i<marks.length;i++){
	// 		System.out.println("Enter Subject " + (i+1) + " mark :");
	// 		marks[i] = Helper.getMark();
	// 	}
		
	// }



	public void findResult(){

		result = "PASS";
		total = 0;
		for(int i=0;i<marks.length;i++){
			if(marks[i] < PASS_MARK ){
				result = "FAIL";

			}	
			total += marks[i];
			//total = total + marks[i];
		}
		average = Helper.getArrayAverage(marks);
	}

	
	public void displayStudent(){
		this.findResult();

		System.out.println("Register Number :" + this.registerNumber);
		System.out.println("Student Name :" + this.studentName);

		for(int i=0;i<marks.length;i++){
			System.out.println("Subject " + (i+1) + " mark :" + marks[i]);	
		}

		System.out.println("Total :" + total);
		System.out.println("Result :" + result);
		System.out.println("Average :" + average);
		System.out.println("PASS_MARK :" + PASS_MARK);
		System.out.println("***********************************");

	}


}