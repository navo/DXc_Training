import java.util.*;
public class Account {
	private long accountNo;
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	private double balance;
	public double getBalance() { 
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double depAmt)
	{
		this.balance=this.balance+depAmt;
		return this.balance;
	}
	public void withraw(double widAmt)
	{
		if(this.balance>widAmt)
		{
			this.balance=this.balance-widAmt;
			
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
	}
}
