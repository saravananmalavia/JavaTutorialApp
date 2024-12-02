import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Pankaj");

		emp1.setAge(35);
		emp1.setGender("Male");
		emp1.setRole("CEO");
		//System.out.println(emp1);

		Employee emp2 = new Employee("Abiseik");

		emp2.setAge(25);
		emp2.setGender("Male");
		emp2.setRole("CEO");
		// System.out.println(emp1);
		// System.out.println(emp2);
		
		try {
			FileOutputStream fos = new FileOutputStream("Employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// write object to file
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			System.out.println("Done");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}