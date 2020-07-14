/*Write a program to print numbers between the range ( say 10 to 100 OR 100 to 200 etc.,)*/
import java.util.Scanner;

public class prog7 {

		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first number");
			int number1=sc.nextInt();
			System.out.println("Enter the last number");
			int number2=sc.nextInt();
			for(int i=number1;i<=number2;i++)
				System.out.println(i);	
			sc.close();
		}

}