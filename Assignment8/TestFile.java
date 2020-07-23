package Assignment;

import java.io.*;
import java.util.*;

public class TestFile {
	public static void main(String ar[]) {
		File file = new File("G:\\File\\Badminton");
		file.mkdir();
		File file1 = new File(file, "Singles.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file2 = new File(file, "Dubbles.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file3 = new File(file, "\\courts");
		file3.mkdir();
		File file4 = new File(file,"Doubles.txt");
		file2.renameTo(file4);
		file1.delete();
	}
}
