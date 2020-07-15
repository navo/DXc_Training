//Write a program to convert given number into word format.
//If i/p is 123 -> output : One Hundred Twenty Three
import java.util.*;
public class prog19 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String[] number = new String[100];
	number[0]="One";
	number[1]="Two";
	number[2]="Three";
	number[3]="Four";
	number[4]="Five";
	number[5]="Six";
	number[6]="Seven";
	number[7]="Eight";
	number[8]="Nine";
	number[9]="Ten";
	number[10]="Eleven";
	number[11]="Twelve";
	number[12]="Thirteen";
	number[13]="Fourteen";
	number[14]="Fifteen";
	number[15]="Sixteen";
	number[16]="Seventeen";
	number[17]="Eighteen";
	number[18]="Nineteen";
	number[19]="Twenty";
	number[20]="Thirty";
	number[21]="Fourty";
	number[22]="Fifty";
	number[23]="Sixty";
	number[24]="Seventy";
	number[25]="Eighty";
	number[26]="Ninety";
	number[28]="Hundred";
	
	System.out.println("Enter any number less than 1000");
	int input=sc.nextInt();
	int input1=input;
	int ar[]= {0,0,0};
	for(int i=2;i>=0;i--) {
		ar[i]=input%10;
		input=input/10;
	}
	if(input==0)
		System.out.println("Zero");
	else {
	if(input1<20)
	{
		System.out.println(number[input1-1]);
	}
	else
	{
		if(ar[0]==0)
		{
			if(ar[2]==0)
				System.out.println(number[17+ar[1]]);
			else
				System.out.println(number[(17+ar[1])]+" "+number[ar[2]-1]);
		}
		else {
			System.out.print(number[ar[0]-1]+" "+number[28]+" ");
			if(ar[2]==0)
				System.out.println(number[17+ar[1]]);
			else
				System.out.println(number[(17+ar[1])]+" "+number[ar[2]-1]);
		}
	}
}
	sc.close();
}
}
