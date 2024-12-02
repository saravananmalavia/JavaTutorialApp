
class StudentManagement{

	public static void main(String[] args) 
	{
		
		// int noOfStudents;

		// Student students[];

		// System.out.println("Enter the no of students :");
		// noOfStudents = Helper.getI();

		// students = new Student[noOfStudents]; // create array of Student

		// for(int i =0; i < students.length;i++){
		// 	students[i] = new Student(); // creating Student object
		// 	System.out.println("Enter the student : " + (i+1) + "details ");
		// 	students[i].readStudent();
		// }
		// System.out.println("STUDENTS DETAILS ARE ");
		// System.out.println("**********************");
		// for(int i =0; i < students.length;i++){
		// 	students[i].displayStudent();
		// }

		// CRUD - create read update delete
	int option;
	do{
		
		Helper.sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Helper.sop("~~ Student mangement System ~~");
		Helper.sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Helper.sop(" 1. Add a new Student   ");
		Helper.sop(" 2. Remove a  Student   ");
		Helper.sop(" 3. Edit a  Student     ");
		Helper.sop(" 4. Display a  Student  ");
		Helper.sop(" 5. Display all Student ");
		Helper.sop(" 6. Exit ");
		Helper.sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Helper.sop(" Enter the option (1-6) " );	
		option = Helper.getI();


		switch(option){
			case 1 :
					Helper.sop("Enter the new Student details");
					break;
			case 2 :
					Helper.sop("Enter the roll no of Student to be removed");
					break;
			case 3 :
					Helper.sop("Enter the roll no of Student to be edited");
					break;
			case 4 :
					Helper.sop("Enter the roll no of Student to be viewed");
					break;
			case 5 :
					Helper.sop("Details of all Students");
					break;
			case 6 :
					System.exit(0);
					break;
			default :
					System.out.println("Enter the correct option (1-6)");
					break;

		}

	}while(option != 6);
			







	}



}

