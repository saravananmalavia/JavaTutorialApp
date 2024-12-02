package sms.bl;
import sms.dto.Customer;
import sms.dl.CustomerDL;
public class CustomerBL{

	public boolean addCustomer(Customer customer){
		// code for business logic
		// validation 
		// any other calculation
		boolean result = true;
		System.out.println("I am in BL add Customer:");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("*******************");

		// after validation and calculation,customer.setNewVales(xx); 

		//send the details to the Database layer
		CustomerDL customerDL = new CustomerDL();
		result = customerDL.addCustomer(customer);

		return result;

	}
	public boolean updateCustomer(Customer customer){
		// code for business logic
		// validation 
		// any other calculation
		boolean result = true;
		System.out.println("I am in BL update Customer:");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("*******************");
		CustomerDL customerDL = new CustomerDL();
		result = customerDL.updateCustomer(customer);

		return result;

	}
	
}