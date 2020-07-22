import java.util.*;
public class TestScoreAnalyzer {

	public static void main(String[] args) {
		
		ScoreAnalyzer obj =new ScoreAnalyzer();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of batsmen");
		int noOfBats = sc.nextInt();
		
	
		for (int i=0;i<noOfBats;i++)
		{
			System.out.println("Enter the Run for batsman "+(i+1));
			obj.addRunsToList(sc.nextInt());
		}
		obj.displayRuns();
		System.out.println("The Run Rate"+obj.calcRunRate());
		System.out.println("Lowest Run Scored"+obj.lowestRunsScored());
		System.out.println("The no of players who batted"+noOfBats);
			

	}

}
