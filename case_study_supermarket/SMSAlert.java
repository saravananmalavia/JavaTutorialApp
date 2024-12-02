package sms.bl;
import sms.dto.CustomerPremium;
public class SMSAlert implements IAlert{
	public boolean doAlert(CustomerPremium customer){
		// call the code to send the SMS
		System.out.println("I am from SMS Alert");
		System.out.println("SMS has been send to : " + customer.getMobileNumber());

		return true;
	}
}
	