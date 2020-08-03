import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date travelDate = null;
		
		
		 Date CurrDate = new Date();
		

		int noOfPassengers;
		Train train;
		TrainDAO object1 = new TrainDAO();
		System.out.println("Enter Train Number :");
		train = object1.findTrain(sc.nextInt());
		sc.nextLine();
		if (train.equals(null)) {
			System.out.println("Train with given number does not exist");
		} else {
			System.out.println("Enter date in the format DDMMYYYY");
			String TravelDate1 = sc.nextLine();
			try {
				travelDate = new SimpleDateFormat("ddMMyyyy").parse(TravelDate1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (travelDate.compareTo(CurrDate) < 0) {
				System.out.println("Check Date");
				System.exit(0);
			} else {
				Ticket object2=new Ticket(travelDate,train);
				System.out.println("Enter Number of Passengers");
				noOfPassengers=sc.nextInt();
				sc.nextLine();
				for(int i=0;i<noOfPassengers;i++)
				{
					System.out.println("Enter values for Passenger "+(i+1));
					System.out.println("Enter Name : ");
					String name=sc.nextLine();
					System.out.println("Enter Age : ");
					int age=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Gender (M/F)");
					char gender=(sc.next().charAt(0));
					object2.addPassenger(name, age, gender);
					sc.nextLine();
				}
				object2.writeTicket();
			}
		}

	}

}
