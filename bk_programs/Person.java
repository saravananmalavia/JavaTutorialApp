class Person {
	String name;
	String mobileNumber;
	//public String address = "1/505B, Sreeniketham, Manjadi";
	private Address address;

	public String getAddress() {
		return this.address.toString();
	}

	public void setAddress(String address) {
		this.address = Address.parse(address);
	}

}

class Address {
   	String building, street, locality, town, district;


   	public String toString() {
   		return this.building + ", " + this.street;

   	}

   	public Address parse(String address) {
   		Address addr = new Address();
   		// TO DO
   		return addr;
   	}
}