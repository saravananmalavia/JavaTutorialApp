package sms.bl;
import sms.dto.CustomerPremium;
public interface IAlert{
	public boolean doAlert(CustomerPremium customer); // abstract method
}