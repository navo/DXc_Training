public class TestCustomer {
	public static void main(String ar[])
	{
	Customer ob=new Customer();
		ob.setCustomerName("John");
		ob.resendialAddress.setAddressLine("Ist Main HSR Layout");
		ob.resendialAddress.setCity("Bangalore");
		System.out.println(ob.getCustomerDetails());
		
		
		Customer ob1=new Customer("John","Ist Main HSR Layout","Bangalore");
		System.out.println(ob1.getCustomerDetails());
		
		
	}
}
