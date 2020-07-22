
public abstract class PrepaidCard implements Rewardable {
	int cardNo;
	double availableBalance;
	double swipeLimit;
	abstract boolean swipeCard(int input);
	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	void rechargeCard(int input)
	{
		availableBalance+=input;
	}
	//int rewardPoints(double amount)
	
}
