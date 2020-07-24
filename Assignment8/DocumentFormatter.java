package Assignment;

import java.io.*;
import java.util.*;

public class DocumentFormatter {
	public static void main(String ar[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file you want to create");
		String fileName = sc.next() + ".txt";
		File file1 = new File(fileName);
		file1.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
		BufferedReader in = new BufferedReader(new FileReader("TopProverbs.txt"));
		String s;
		while ((s = in.readLine()) != null) {
			s = s.trim().replaceAll("\\s+", " ");
			out.write(s);
			out.newLine();
			out.flush();

		}

	}
}
