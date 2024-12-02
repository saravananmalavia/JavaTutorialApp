import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream is = new FileInputStream("Employee.ser");
			ObjectInputStream ois = new ObjectInputStream(is);
			Employee emp1 = (Employee) ois.readObject();
			Employee emp2 = (Employee) ois.readObject();
			// Object -- return 

			ois.close();
			is.close();
			System.out.println(emp1);
			System.out.println(emp2);
//Output will be "Employee:: Name=Pankaj Age=35 Gender=Male Role=CEO"
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}