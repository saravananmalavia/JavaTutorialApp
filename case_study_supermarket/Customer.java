package sms.dto;
public class Customer{
	int customerId;
	String customerName;
	String customerAddress;
	long mobileNumber;

	public int getCustomerId(){
		return customerId;
	}
	public void setCustomerId(int customerId){
		this.customerId = customerId;
	}
	public String getCustomerName(){
		return customerName;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	public long getMobileNumber(){
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber){
		this.mobileNumber = mobileNumber;
	}

	public String getCustomerAddress(){
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress){
		this.customerAddress = customerAddress;
	}







}
