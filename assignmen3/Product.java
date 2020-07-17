
public class Product {
	int productCode;
	String productName;
	double productPrice;
	char categoryCode;
	private static int prodCounter=100;
	public int getProductCode() {
		return productCode;
	}
	private int generateProductCode()
	{
		prodCounter=prodCounter+1;
		return prodCounter;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	public static int getProdCounter() {
		return prodCounter;
	}
	public static void setProdCounter(int prodCounter) {
		Product.prodCounter = prodCounter;
	}
	public Product(String productName, double productPrice, char categoryCode) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = categoryCode;
		this.productCode= generateProductCode();
	}
	public Product(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = 'E';
		this.productCode= generateProductCode();
		
	}

}
