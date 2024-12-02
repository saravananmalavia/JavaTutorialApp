import java.io.Serializable;

// bean class model class dto class 

//public class Employee  {
public class Employee implements Serializable {

//public class Employee {
	//private static final long serialVersionUID = -299482035708790407L;

	private String name;
	private String gender;
	private int age;

	private String role;
	// private transient String role;

	public Employee(String n) {
		this.name = n;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee:: Name=" + this.name + " Age=" + this.age + " Gender=" + this.gender + " Role=" + this.role;
	}

}