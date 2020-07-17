
public class GiftCardTest {
	public static void main(String ar[]) {
		GiftCard obj1 = new GiftCard(1000000000,0,true);
		obj1.rechargeCard(2000);
		obj1.swipeCard(400);
		obj1.swipeCard(500);
		System.out.println("Card no :"+obj1.getCardNo()+"\n"+"Balance = "+obj1.getBalance());
		GiftCard obj2 = new GiftCard();
		obj2.rechargeCard(3000);
		obj2.swipeCard(500);
		obj2.swipeCard(2600);
		System.out.println("Card no :"+obj2.getCardNo()+"\n"+"Balance = "+obj2.getBalance());
	}
}
