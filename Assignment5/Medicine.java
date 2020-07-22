
public abstract class Medicine {
double price;
String date;
void getDetails()
{
	System.out.println("Price : "+this.price+"\n"+"Expiry Date : "+this.date);
	
}
abstract void displaylabel();
}
