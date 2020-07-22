import java.util.*;

public class ScoreCard {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		System.out.println("Enter runs by Rahane,Rahul,Kolhi,Dhoni,Rahul");
		for (int i = 0; i < ar.length; i++)
			ar[i] = sc.nextInt();

		map.put("Rahane", ar[0]);
		map.put("Rahul", ar[1]);
		map.put("Kohli", ar[2]);
		map.put("Dhoni", ar[3]);
		map.put("Rahul", ar[4]);

		int max = 0, sum = 0;

		for (Map.Entry<String, Integer> me : map.entrySet()) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
			if (max < me.getValue()) {
				max = me.getValue();
			}
			sum = sum + me.getValue();
		}
		System.out.println("The total Score is "+sum);
		System.out.println("The max run getter is");
		
		

	}
}
