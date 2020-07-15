/*Write a program to take a integer as input
   Print the sum of digits of the number?
   ex 9999 - 36 - 9*/
import java.util.Scanner;
public class Prog1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
	
		while(true) 
		{
			while(number!=0)
			{
				sum=sum+number%10;
				number=number/10;
			}
			number=0;
			System.out.println("The sum of the numbers is = "+sum);
			
		
		if(sum>9) 
		{
			number=sum;
			sum=0;
		}
		else
			break;
		sc.close();
		}
	}
}
