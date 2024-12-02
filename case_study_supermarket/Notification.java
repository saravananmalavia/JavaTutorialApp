package sms.bl;
import sms.dto.CustomerPremium;

public class Notification{

// method overloading -- polymorphism  - comiple time 
// more than one method can have  same name  with in the same class
// with diffrent parameter
//
	public static boolean sendAlert(long mobileNumber, String message){
		// call the code to send the sms
		System.out.println("Message has been send to " + mobileNumber);
		System.out.println("Message :" + message);
		return true;
	}

	public static boolean sendAlert(String address, String message){
		// prepare list to send the message via post

		System.out.println("Message has been send to " + address);
		System.out.println("Message :" + message);
		return true;
	}


	public static boolean sendAlert(IAlert  alert,CustomerPremium customer){

		alert.doAlert(customer);
		return true;
	}







	

}