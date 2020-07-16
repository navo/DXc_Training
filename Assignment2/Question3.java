//Write a function to get largest number in the given array.
import java.util.*;
public class question3 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int array[] = {10, 11, 13, 76, 2}; 
		int max = array[0];
		for (int i = 1; i < 5; i++) 
            if (array[i] > max) 
                max = array[i]; 
       System.out.println("Largest number = "+max);
       sc.close();
	}
}
