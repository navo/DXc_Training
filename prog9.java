//To find prime number
import java.util.*;
public class prog9 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("The number is a prime number");
		else
			System.out.println("The number is not a prime number");
		sc.close();
	}

}
