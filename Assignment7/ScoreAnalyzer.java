import java.util.*;


public class ScoreAnalyzer {
	private LinkedList<Integer> runsData= new LinkedList();

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	} 
	public ScoreAnalyzer() {
		// TODO Auto-generated constructor stub
	}
	void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	double calcRunRate()
	{
		
		int sum=0;
		for(int i=0;i<runsData.size();i++)
		{
			sum=sum+runsData.get(i);
			
		}
		return sum/50;
	}
	int lowestRunsScored() {
	return(Collections.min(runsData));
	}
	void displayRuns()
	{
		for(int i:runsData)
		{
			System.out.println(runsData.indexOf(i)+" "+i);
		}
	}

}
