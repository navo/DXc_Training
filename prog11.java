import java.util.Scanner;

//find the reverse of a number
public class prog11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int a,revNo=0;
		while(number!=0)
		{
			a=number%10;
			revNo=(revNo*10)+a;
			number=number/10;
		}
		System.out.println("The reverse number is = "+revNo);
		sc.close();
	}

}
