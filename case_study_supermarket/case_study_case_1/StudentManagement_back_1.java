
class StudentManagement{

	public static void main(String[] args) 
	{
		
		Student student1 = new Student(); 
		student1.readStudent();
		
		int markValue1[]={50,45,78};
		int markValue2[]={50,55,98};
		int regNumber =102;
		String name = "John";

		Student student2 = new Student(101,"Richard",markValue1); 
		Student student3 = new Student(regNumber,name,markValue2);


		student1.displayStudent();
		student2.displayStudent();
		student3.displayStudent();

	}



}

class Student{
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

	public Student(int rNo,String name,int mark[]){
		registerNumber = rNo;
		studentName = name;
		marks = mark;	
		PASS_MARK = 50;
		System.out.println("I am from param constructor");

	}

	public void readStudent(){

		System.out.print("Enter the Register Number :");
		registerNumber = Helper.getI();
		System.out.print("Enter the Name :");
		studentName = Helper.getS();
		for(int i=0;i<marks.length;i++){
			System.out.println("Enter Subject " + (i+1) + " mark :");
			marks[i] = Helper.getI();
		}
		
	}



	public void findResult(){

		result = "PASS";

		for(int i=0;i<marks.length;i++){
			if(marks[i]<50){
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