import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ticket  {
	private int counter = 100;
	private String pnr;
	private Date travelDate;
	
	HashMap<Passenger, Double> passengers = new HashMap<Passenger, Double>();
	Train train;
	
	
	public Ticket(Date travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}

	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	private String generatePnr() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String date1 = dateFormat.format(travelDate);
		char D = (train.getDestination()).charAt(0);
		char A = (train.getSource()).charAt(0);
		pnr = A + D + "_" + date1 + "_" + counter;
		counter++;
		return pnr;
	}

	private double calcPassengerFare(Passenger obj) {
		double orgFare = train.getTicketPrice();
		double fare;
		if (obj.getAge() <= 12) {
			fare = orgFare * 0.5;
		} else if (obj.getAge() >= 60) {
			fare = orgFare * 0.6;
		} else if (obj.getGender() == 'F') {
			fare = orgFare * 0.75;
		} else {
			fare = orgFare;
		}
		return fare;

	}

	public void addPassenger(String name, int age, char gender) {
		Passenger object = new Passenger(name, age, gender);
		

		passengers.put(object, calcPassengerFare(object));

	}

	private double calculateTotalTicketPrice() {
		double totFare = 0;
		for (Entry<Passenger, Double> mapElement : passengers.entrySet()) {
			totFare = totFare + (double) mapElement.getValue();
		}

		return totFare;
	}

	private StringBuilder generateTicket() {
		
		StringBuilder format =  new StringBuilder();
		
		format.append("PNR :" + generatePnr() + "\n");
		format.append("Train No :" + train.getTrainNo() + "\n");
		format.append("Train Name :" + train.getTrainName() + "\n");
		format.append("From :" + train.getSource() + "\n");
		format.append("To :" + train.getDestination() + "\n");
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy" + "\n");
		format.append("Travel Date :" + dateFormat1.format(travelDate) + "\n");
		format.append("Passengers : " + "\n\n");
		format.append("Name" + "\t" + "Age" + "\t" + "Gender" + "\t" + "Fare"+"\n");
		for (Entry<Passenger, Double> mapElement : passengers.entrySet()) {
			Passenger object = (Passenger) mapElement.getKey();
			format.append(object.getName() + "\t" + object.getAge() + "\t" + object.getGender() + "\t"
					+ (double) mapElement.getValue() + "\n");
		}
		format.append("Total Price" + calculateTotalTicketPrice());
		return format;

	}

	public void writeTicket() {
		
		generateTicket();
		BufferedWriter bw = null;
		try {
			File file = new File("pnr.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(generateTicket().toString());
			System.out.println("Ticket Printed with PNR"+pnr);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}

	}

	}


