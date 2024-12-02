package sms.dl;
import sms.dto.Customer;
public class CustomerDL{

	public boolean addCustomer(Customer customer){
		// code for connectiong db
		// and excute the db operartion
		boolean result = true;
		System.out.println("I am in DL add Customer:");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("*******************");

		return result;

	}
	public boolean updateCustomer(Customer customer){
		// code for connectiong db
		// and excute the db operartion
		boolean result = true;
		System.out.println("I am in DL update Customer:");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("*******************");

		return result;

	}
	
}