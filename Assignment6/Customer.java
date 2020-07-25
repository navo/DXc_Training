
public class Customer {
	private String custNo;
	private String custName;
	private String category;

	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}

	void check(String custNo, String custName, String category){
		try {
			if (custNo.charAt(1) != 'c' || custNo.charAt(1) != 'C')
				throw new MyException();

			if (custName.length() < 4)
				throw new MyException();
			if (category == "Gold" || category == "Platinum" || category == "Silver") {

			} else
				throw new MyException();
		}

		catch (MyException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}

}
