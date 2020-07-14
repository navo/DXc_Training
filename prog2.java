/*Write a program to display the factorial of numbers from 1 to the input number?
   Take input using scanner? Also display if the factorial is a prime number or not?*/
import java.util.Scanner;
public class prog2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int endNumber=sc.nextInt();
		int factorial=1;
		int flag=0;
		int number=1;
		while(number<=endNumber)
		{
		for(int i=number;i!=0;i--)
		{
			factorial=factorial*i;
		}
		
		System.out.println("The factorial of the number is = "+factorial);
		for(int i=2;i<=factorial/2;i++)
		{
			if(factorial%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("The factorial is a prime number");
		else
			System.out.println("The factorial is not a prime number");
		number++;
		
	}
		sc.close();
	}
}
