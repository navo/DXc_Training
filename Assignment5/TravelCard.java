
public class TravelCard extends PrepaidCard {
	public TravelCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	int rewardPoints;
	@Override
	boolean swipeCard(int input) {
		if(input<=swipeLimit&&input<=availableBalance)
		return true;
		else
		return false;
	}
	@Override
	public int rewardPoints(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
