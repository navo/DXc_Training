import java.util.*;
public class CricketTest {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target runs:");
		int targetRuns=sc.nextInt();
		System.out.println("Enter the current over:");
		int currentOver=sc.nextInt();
		System.out.println("Enter the current Score:");
		int currentScore=sc.nextInt();
		OneDayCricket obj=new OneDayCricket(targetRuns);
		obj.setCurrentOver(currentOver);
		obj.setCurrentScore(currentScore);
		System.out.println("Current Run rate:");
		System.out.println(obj.calcCurrentRunrate(currentScore, currentOver));
		System.out.println("Required Run rate:");
		System.out.println(obj.calcReqdRunrate((targetRuns-currentScore),(obj.getMaxOver()-currentOver)));
	}
}
