import java.util.*;

public class AccountTest1 {
	public static void main(String ar[]) {
		Account obj = new Account();
		System.out.println("Enter the Ac no");
		Scanner sc = new Scanner(System.in);
		long acNo = sc.nextLong();
		obj.setAccountNo(acNo);
		System.out.println("Enter the balance");
		double bal = sc.nextDouble();
		obj.setBalance(bal);
		System.out.println("Enter the balance to deposit");
		double depAmt = sc.nextDouble();
		obj.deposit(depAmt);
		System.out.println("Enter the balance to withraw");
		double witAmt = sc.nextDouble();
		obj.withraw(witAmt);
		System.out.println("The balance= " + obj.getBalance());
		sc.close();
	}

}
