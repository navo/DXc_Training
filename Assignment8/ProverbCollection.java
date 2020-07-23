package Assignment;

import java.io.*;
import java.util.*;

public class ProverbCollection {

	static void storeProverb(String str) throws IOException {


		BufferedWriter out = new BufferedWriter(new FileWriter("TopProverbs.txt",true));
			out.write(str);
			out.newLine();
			out.flush();
			out.close();
		
	}

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		String st = "";
		while (true) {
			System.out.println("Enter Proverb or '0' to Exit");
			st = sc.nextLine();
			if (st.equals("0")) {
				break;
			} else {
				storeProverb(st);
			}

		}
		sc.close();
	}
}
