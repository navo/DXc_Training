import java.sql.SQLException;
import java.util.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
public class TrainDAO {
	
	private int trainNo;
	private String trainName;
	private String source;
	private String Destination;
	private double ticketPrice;

	Train findTrain(int trainNo)
	{
		try {
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("DXC");
			rs.setPassword("1234");
			rs.setCommand("select * from Trains where TRAIN_NO="+trainNo);
			rs.execute();
			
			
			{
			rs.beforeFirst();
			while (rs.next())
			{
				this.trainNo =rs.getInt("TRAIN_NO");
				this.trainName=rs.getString("TRAIN_NAME");
				this.source=rs.getString("SOURCE");
				this.Destination=rs.getString("DESTINATION");
				this.ticketPrice=rs.getDouble("TICKET_PRICE");	
			}	
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		return new Train(this.trainNo, trainName, source, Destination, ticketPrice);
		
	
	}
}
