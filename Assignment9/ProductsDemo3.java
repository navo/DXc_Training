import java.sql.SQLException;
import java.util.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ProductDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String pCode;
		String pName;
		String pPrice;
		String pCat;
		ArrayList<Product> product = new ArrayList<>();

		while (true) {
			System.out.println("Press any key to input values, -1 to exit");

			input = sc.nextLine();

			if (input.equals("-1")) {
				break;
			} else {
				System.out.println("Enter Product Code");
				pCode = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Name");
				pName = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Price");
				pPrice = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Category");
				pCat = sc.next();
				sc.nextLine();
				product.add(new Product(pCode, pName, pPrice, pCat));

			}
		}

		try {
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("DXC");
			rs.setPassword("1234");
			rs.setCommand("select PROD_CODE,PROD_NAME,PROD_PRICE,PROD_CATG from PRODUCTS");
			rs.execute();
			// Update

			for (int i = 0; i < product.size(); i++) {
				Product data = product.get(i);

				String pCode1 = data.getpCode();
				String pName1 = data.getpName();
				String pPrice1 = data.getpPrice();
				String pCat1 = data.getpCat();
				rs.afterLast();
				rs.moveToInsertRow();
				rs.updateString("PROD_CODE", pCode1);
				rs.updateString("PROD_NAME", pName1);
				rs.updateString("PROD_PRICE", pPrice1);
				rs.updateString("PROD_CATG", pCat1);
				rs.insertRow();
			}

			rs.beforeFirst();
			while (rs.next()) {
				System.out.println(rs.getString("PROD_CODE") + ":" + rs.getString("PROD_NAME") + ":"
						+ rs.getString("PROD_PRICE") + ":" + rs.getString("PROD_CATG"));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
