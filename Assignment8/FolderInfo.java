package Assignment;

import java.io.File;

public class FolderInfo {
	static void printDirectory(String path)
	{
		int c=0;
		File myFile = new File(path);
		File[] fileList = myFile.listFiles();
		for (File file : fileList) {
			if (file.isFile()) {

				System.out.println("File :"+file.getName());
				System.out.println("Absoloute Path :"+file.getAbsolutePath());
				System.out.println("Folder Path :"+file.getParent());
				c=1;
			}
			if(file.isDirectory()) {
				System.out.println("Directory: "+file.getName());
				System.out.println("Folder Path :"+file.getParent());
				c=1;
			}
		}
		if(c==0)
			System.out.println("No Folder exists with the given name");
	}
	public static void main(String args[])
	{
		printDirectory("G:\\File\\Badminton");
	}

}
