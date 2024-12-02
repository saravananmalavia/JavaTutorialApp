import java.util.*;
public class  Person{
String id, name, department;
static Scanner in;
public static void main(String args[]){
// Person person1 = new Person();
// person1.readPerson();
// person1.displayPerson();

Student student1 = new Student();
student1.readMarks();
student1.calculateMarks();
student1.displayMarks();

	Student student2 = new Student("101","Abi","IT",67,89,56,56,78);
	// student1.readMarks();
	student2.calculateMarks();
	student2.displayMarks();

// Staff staff1 = new Staff();
// staff1.readSalary();
// staff1.calculateSalary();
// //staff1.displaySalary();
// //staff1.calculateSalary1();

}

public Person(){
in = new Scanner(System.in);
}

public Person(String id,String name,String department){
in = new Scanner(System.in);
this.id = id;
this.name = name;
this.department = department;
}

public void readPerson(){
System.out.print("Enter the ID Number : ");
id = in.next();
System.out.print("Enter the Name : ");
name = in.next();
System.out.print("Enter the Department : ");
department = in.next();
} 

public void displayPerson(){
System.out.println(" ID Number : " + id);
System.out.println(" Name   : " + name);
System.out.println(" Department: " + department);
} 

}

class Student extends Person{
int tamil, english, maths, science, social, total;
public Student(){
	super();
}

// public Student(int tamil,int english,int maths,int science,int social){
// this.tamil = tamil;
// this.english = english;
// this.maths = maths;
// this.science = science;
// this.social = social; 
// }

	public Student(String id,String name,String department, int tamil,int english,int maths,int science,int social){
		super(id, name, department);
		this.tamil = tamil;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social; 
	}

	public void readMarks(){
		readPerson();
		System.out.print("Enter the Tamil Mark : ");
		tamil = in.nextInt();
		System.out.print("Enter the English Mark : ");	
		english = in.nextInt();
		System.out.print("Enter the Maths Mark : ");
		maths = in.nextInt();
		System.out.print("Enter the Science Mark : ");
		science = in.nextInt();
		System.out.print("Enter the Social Mark : ");
		social = in.nextInt();
	}

	public void calculateMarks(){
		total = (tamil + english + maths + science + social);
	}

	public void displayMarks(){
		System.out.println("	MARK SHEET	");
		System.out.println("**********************");
		displayPerson();
		System.out.println("Tamil Mark : " + tamil);
		System.out.println("English Mark : " + english);
		System.out.println("Maths Mark : " + maths);
		System.out.println("Science Mark : " + science);
		System.out.println("Social Mark : " + social);
		System.out.println("**********************");
		System.out.println("Total : " + total);

	}
}

// class Staff extends Person{
// double basicPay, grossPay, netPay, allowance=100.20, tax;

// public Staff(){
// 	super();
// }

// public void readSalary(){
// readPerson();
// System.out.println("Enter the basic pay : ");
// basicPay = in.nextInt();
// }

// public void calculateSalary(){

// allowance = (3/100)*basicPay;
// tax = (5/100)*basicPay;
// grossPay = basicPay + allowance;
// netPay = grossPay - tax;

// System.out.println("	STAFF DETAILS	");

// System.out.println("	PAY ROLL	");
// System.out.println("**********************");
// displayPerson();
// System.out.println("Basic Pay : " + basicPay);
// System.out.println("Allowance : " + allowance);
// System.out.println("Tax : " + tax);
// System.out.println("Gross Pay : " + grossPay);
// System.out.println("Net Pay : " + netPay);
// System.out.println("**********************");
// System.out.println("**********************");

// }
// public void calculateSalary1(){
// System.out.println("begin");
// System.out.println("end");
// }

// public void display(){
// 	System.out.println("I am in display method");
// }

// public void displaySalary(){
// System.out.println("	STAFF DETAILS	");

// System.out.println("	PAY ROLL	");
// System.out.println("**********************");
// displayPerson();
// System.out.println("Basic Pay : " + basicPay);
// System.out.println("Allowance : " + allowance);
// System.out.println("Tax : " + tax);
// System.out.println("Gross Pay : " + grossPay);
// System.out.println("Net Pay : " + netPay);
// System.out.println("**********************");
// System.out.println("**********************");
// }


// }