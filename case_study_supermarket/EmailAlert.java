package sms.bl;
import sms.dto.CustomerPremium;
public class EmailAlert implements IAlert{
	public boolean doAlert(CustomerPremium customer){
		// call the code to send the email
		System.out.println("I am from Email Alert");
		System.out.println("Email has been send to : " + customer.getEmail());

		return true;
	}
}
	
