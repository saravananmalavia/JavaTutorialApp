
class StudentManagement{
	static Student students[];



	public static void main(String[] args) 
	{
		int noOfStudents;
		System.out.println("Enter the no of students :");
		noOfStudents = Helper.getI();

		students = new Student[noOfStudents]; // create array of Student

		 for(int i =0; i < students.length;i++){
		 	students[i] = new Student(); 
		 }
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
						int index = -1;
						int registerNumber;
						
						for(int i = 0;i<students.length;i++){
							if(students[i].registerNumber == 0 ){
								index = i;
								break;
							}
						}
						if(index != -1){
							Helper.sop("Enter the new Student details");
							students[index].readStudent();

						}else{

							Helper.sop("Sorry admission full");
						}



						break;
				case 2 :
						index = -1;
						Helper.sop("Enter the roll no of Student to be removed");
						registerNumber = Helper.getI();

						for(int i = 0;i<students.length;i++){
							if(students[i].registerNumber == registerNumber ){
								index = i;
							}
						}
						if(index != -1){
							students[index] = new Student();
							Helper.sop("Student details removed successfully ");

						}else{

							Helper.sop("Sorry There is no such student ");
						}

						break;
				case 3 :
						index = -1;
						Helper.sop("Enter the roll no of Student to be edited");

						registerNumber = Helper.getI();

						for(int i = 0;i<students.length;i++){
							if(students[i].registerNumber == registerNumber ){
								index = i;
							}
						}
						if(index != -1){
							Helper.sop("******* Student details *******");
							students[index].displayStudent();

							Helper.sop("Enter the edited details");
							students[index].updateStudent();


						}else{

							Helper.sop("Sorry There is no such student ");
						}

						break;
				case 4 :
						index = -1;
						Helper.sop("Enter the roll no of Student to be viewed");
						registerNumber = Helper.getI();

						for(int i = 0;i<students.length;i++){
							if(students[i].registerNumber == registerNumber ){
								index = i;
							}
						}
						if(index != -1){
							Helper.sop("******* Student details *******");
							students[index].displayStudent();

						}else{

							Helper.sop("Sorry There is no such student ");
						}



						break;
				case 5 :
						
						Helper.sop("Details of all Students");
						for(int i = 0;i<students.length;i++){
							if(students[i].registerNumber != 0 ){
								students[i].displayStudent();
							}
						}
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

