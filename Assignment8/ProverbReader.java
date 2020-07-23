package Assignment;
import java.io.*;
import java.util.*;

public class ProverbReader {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new
				FileReader("TopProverbs.txt"));
		String s;
		 while ((s = in.readLine()) != null) {
	            System.out.println(s);
	        }
	}

}
