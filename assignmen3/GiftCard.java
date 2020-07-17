import java.util.*;

public class GiftCard {
	Random rand = new Random();

	public GiftCard(long cardNo, double balance, boolean active) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
		this.active = active;
	}

	private long cardNo;
	private double balance = 0;
	private boolean active;

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public GiftCard() {
		super();
		this.active = true;
		this.cardNo = (long) (rand.nextDouble() * 10000000000L);
	}

	public void rechargeCard(int amt) {
		if (active == true) {
			this.balance = this.balance + amt;
			System.out.println("Money Added");
		}
	}

	public void swipeCard(int amt) {
		if (active == true && this.balance > amt) {
			this.balance = this.balance - amt;
			System.out.println("Amount Debited");
		} else
			System.out.println("Not Enough Balance");
	}

}
