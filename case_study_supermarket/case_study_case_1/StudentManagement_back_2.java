
class StudentManagement{

	public static void main(String[] args) 
	{
		
		int noOfStudents;

		Student students[];

		System.out.println("Enter the no of students :");
		noOfStudents = Helper.getI();

		students = new Student[noOfStudents]; // create array of Student

		for(int i =0; i < students.length;i++){
			students[i] = new Student(); // creating Student object
			System.out.println("Enter the student : " + (i+1) + "details ");
			students[i].readStudent();
		}
		System.out.println("STUDENTS DETAILS ARE ");
		System.out.println("**********************");
		for(int i =0; i < students.length;i++){
			students[i].displayStudent();
		}

	}



}

