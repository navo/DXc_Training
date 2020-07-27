
public class Product {
private String pCode;
private String pName;
private String pPrice;
private String pCat;
public Product(String pCode, String pName, String pPrice, String pCat) {
	super();
	this.pCode = pCode;
	this.pName = pName;
	this.pPrice = pPrice;
	this.pCat = pCat;
}
public String getpCode() {
	return pCode;
}
public void setpCode(String pCode) {
	this.pCode = pCode;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpPrice() {
	return pPrice;
}
public void setpPrice(String pPrice) {
	this.pPrice = pPrice;
}
public String getpCat() {
	return pCat;
}
public void setpCat(String pCat) {
	this.pCat = pCat;
}

}
