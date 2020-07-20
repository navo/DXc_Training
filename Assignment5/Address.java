
public class Address {
private String addressLine;
private String city;
public Address(String addressLine, String city) {
	super();
	this.addressLine = addressLine;
	this.city = city;
}
public Address() {
	// TODO Auto-generated constructor stub
}
public String getAddressLine() {
	return addressLine;
}
public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
String getAddressDetails()
{	
	return(this.addressLine+","+this.city);
}
}
