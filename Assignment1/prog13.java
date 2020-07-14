import java.util.Scanner;
public class prog13 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int factorial=1;
		for(int i=number;i!=0;i--)
		{
			factorial=factorial*i;
		}
		
		System.out.println("The factorial of the number is = "+factorial);
		
		sc.close();
	}
}
