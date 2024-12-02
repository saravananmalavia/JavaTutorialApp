class StaticDemo2{
	public static void main(String args[]){
		Student s1 = new Student(101,"John",56);
		Student s2 = new Student(102,"Peter",66);
		Student s3 = new Student(103,"Richard",46);

		s1.display();
		s2.display();
		s2.setPassMark(60);
		s3.display();
		//Student.setMark(30);
		s1.setMark(30);
		s1.display();


	}
}

class Student{

	int id;
	String name;
	int mark;
	static int PASS_MARK = 50;

	public Student(){

	}

	public Student(int id, String name, int mark){
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	public static void setPassMark(int mark){
		PASS_MARK = mark;
	}
	// public static  void setMark(int m){
	// 	mark = m;
	// }
	public  void setMark(int m){
	 	mark = m;
	}

	public  void display(){
		System.out.println("ID :" + this.id);
		System.out.println("Name :" + this.name);
		System.out.println("Mark :" + this.mark);
		System.out.println("PASS_MARK :" + this.PASS_MARK);

		System.out.println("*************************");

	}

}