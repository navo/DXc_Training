import java.util.*;
public class TestProduct {
	public static void main(String ar[])
	{
		Product ob1=new Product("Dishwasher",40000.25,'K');
		Product ob2=new Product("Computer",37000.23);
		System.out.println(" Product Code : "+ob1.getProductCode());
		System.out.println(" Name : "+ob1.getProductName());
		System.out.println(" Price : "+ob1.getProductPrice());
		System.out.println(" Category : "+ob1.getCategoryCode());
		
		System.out.println(" Product Code : "+ob2.getProductCode());
		System.out.println(" Name : "+ob2.getProductName());
		System.out.println(" Price : "+ob2.getProductPrice());
		System.out.println(" Category : "+ob2.getCategoryCode());
	}
}
