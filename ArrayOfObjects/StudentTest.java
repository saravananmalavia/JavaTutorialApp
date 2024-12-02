class Student{
	private String name;
	private int mark1;
	int mark2;
	int total;
	static int MIN_MARK;

	static{
		MIN_MARK = 50;
	}

public Student(){

}
	public Student(String name,int m1,int m2){
		this.name = name;
		mark1 = m1;
		mark2 = m2;
	}
	public void findTotal(){
		total = mark1 + mark2;
	}
	public void display(){
		this.findTotal();
		System.out.println("Name : " + this.name);
		System.out.println("Mark1 : " + this.mark1);
		System.out.println("Mark2 : " + this.mark2);
		System.out.println("Total : " + this.total);
		printReslt();
	}

	public String getName(){
		return this.name;
	}

	public static void printReslt(){
		//this.findTotal();
		//System.out.println("Total : " + this.total);
		System.out.println("MIN_MARK : " + MIN_MARK);

	}

	public String toString(){
			this.findTotal();
		String result ="";
		result += "Name : " + this.name + "\n";
		result += "Mark1 : " + this.mark1 + "\n";
		result += "Mark1 : " + this.mark2 + "\n";
		result += "Total : " + this.total + "\n";
		return result;
	}
}
class StudentTest{

	public static void main(String args[]) {

		Student sarav = new Student("saravanan",70,80);
		// 		sarav.findTotal();
		// 		sarav.display();

		Student john = new Student("John",90,100);
		// 		john.findTotal();
		// 		john.display();

		int values[] = new int[10];
		values[0] = 10;

		Student students[] = new Student[10];

		String sample = " " + sarav;

		// System.out.println(sarav);
		// System.out.println(sample);

		students[0] = sarav;
		students[1] = john;
		students[2] = new Student("keltron",80,10);	

		students[0].findTotal();
		students[0].display();

		students[1].findTotal();
		students[1].display();
		try{
			students[3].findTotal();
		    students[3].display();

		    
		}catch(Exception e){

		}

		students[2].findTotal();
			students[2].display();
		

		

		


		for(int i=0;i<students.length;i++){
			//students[i]  = new Student();
			//students[i].readStudent()
			students[i] = new Student(("keltron " + i),(10+i),(20+i));
			students[i].display();
			System.out.println(students[i]);
		}

		// for(Student student : students ){
		// 	System.out.println(student);
		// }


	}
	
}


// class Testing{

// 	public static void main(String args){

// 		Student s1 = new Student();
// 		s1.getName()
// 		System.out.println(s1.name);



// 	}
// }






