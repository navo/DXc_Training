import java.util.Scanner;
//to check palindrome number
public class prog12 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int numbercopy=number;
		int a,revNo=0;
		while(number!=0)
		{
			a=number%10;
			revNo=(revNo*10)+a;
			number=number/10;
		}
		if(revNo==numbercopy)
			System.out.println("It is Palindrome");
		if(revNo!=numbercopy)
			System.out.println("It is not Palindrome");
		sc.close();
	}
}
