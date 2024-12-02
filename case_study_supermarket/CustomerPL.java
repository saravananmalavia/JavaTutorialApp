package sms.pl;

import sms.dto.Customer;
import sms.dto.CustomerPremium;
import sms.bl.CustomerBL;
import sms.bl.Notification;
import sms.bl.EmailAlert;
import sms.bl.SMSAlert;
import sms.bl.IAlert;
class CustomerPL{

	public static void main(String args[]){
		boolean output;

		// dto object creation
		//Customer customer = new Customer();
		CustomerPremium customer = new CustomerPremium();
		// assign values to the dto object
		customer.setCustomerId(1001);
		customer.setCustomerName("Saravanan");
		customer.setMobileNumber(94434116);
		customer.setCustomerAddress("Trivandrum");
		customer.setEmail("sarav@ss.com");

		// passing customer data to business logic

		// CustomerBL customerBL = new CustomerBL();
		// output = customerBL.addCustomer(customer);

		// // depends on the response received from the bl making the display message
		// if(output){
		// 	System.out.println("Customer details added successfully");
		// }else{
		// 	System.out.println("Please try again later");
		// }
		String message = "Have a good day !";

		// execution will be deponds the parameter passed 
		// Notification.sendAlert(customer.getMobileNumber(),message);
		// Notification.sendAlert(customer.getCustomerAddress(),message);
		IAlert email = new IAlert();
		
		IAlert email = new EmailAlert();
		IAlert sms = new SMSAlert();

		Notification.sendAlert(email,customer);
		Notification.sendAlert(sms,customer);

	}
	
}