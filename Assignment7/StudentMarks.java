import java.util.*;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> marks = new ArrayList<>();
		int sum = 0;
		System.out.println("Enter The number of students");
		int numStu = sc.nextInt();
		System.out.println("Enter the marks");
		for (int i = 0; i < numStu; i++) {
			marks.add(sc.nextInt());
		}
		int max = marks.get(0);
		Iterator<Integer> itr = marks.iterator();
		while (itr.hasNext()) {
			int check = itr.next();
			if (max < check)
				max = check;
			sum = sum + check;
		}
		double avg = sum / numStu;
		System.out.println("The Highest marks is :" + max);
		System.out.println("The average marks is : " + avg);
		System.out.println("Third student marks is " + marks.get(2));
		Collections.sort(marks);
		for (int i = 0; i < marks.size(); i++) {
			System.out.print(i+1 + "-" + marks.get(i)+" ");
		}

	}

}
