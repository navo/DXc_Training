//Write a program to find sum of individual digits of given number
import java.util.*;
public class prog15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
		while(number!=0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		number=0;
		System.out.println("The sum of the numbers is = "+sum);
		sc.close();
	}
}
