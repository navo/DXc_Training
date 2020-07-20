public class Customer{
private String customerName;
Address resendialAddress=new Address() ;
public Customer(String customerName,String addressLine,String city) {
	this.customerName = customerName;
	getResendialAddress().setAddressLine(addressLine);
	getResendialAddress().setCity(city);

}
public Customer() {
	// TODO Auto-generated constructor stub
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}


String getCustomerDetails()
{
	
	return("Customer :  "+this.customerName+"\n"+"Resendial Address :  "+getResendialAddress().getAddressDetails());
}
public Address getResendialAddress() {
	return resendialAddress;
}
public void setResendialAddress(Address resendialAddress) {
	this.resendialAddress = resendialAddress;
}

}
