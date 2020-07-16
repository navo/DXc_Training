//Write a program to find whether a given 3 digit number is an Armstrong number or not.
import java.util.*;
public class question4 {
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	int num, num1, rem,finalNo  = 0;
    System.out.println("Enter a three-digit integer: ");
    num=sc.nextInt();
    num1 = num;

    while (num1 != 0) {
        rem = num1 % 10;
       finalNo += rem * rem * rem;
       num1 /= 10;
    }

    if (finalNo == num)
    	System.out.println(num+ " is an armstrong number");
    else
    	System.out.println(num+ " is not an armstrong number");
	sc.close();
	}
}
