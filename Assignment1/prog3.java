/*Write a program to display number of days in a month? Month Name(String) and
   year should be taken as input? Leap year should be considered?*/
import java.util.*;
public class prog3 {
	public static void main(String args[])
	{
		Calendar calendar = Calendar.getInstance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		System.out.println("Enter the Month in full");
		String month=sc.next();
		month=month.toUpperCase();
		int intMonth=0;
		int flag=0;
		
		month= month.toUpperCase();
		while(flag==0)
		{
			if(month.equals("JANUARY")) {
				intMonth=1;break;
			}
			if(month.equals("FEBRUARY")){
				intMonth=2;break;}
			if(month.equals("MARCH")) {
				intMonth=3;break;}
			if(month.equals("APRIL")) {
				intMonth=4;break;}
			if(month.equals("MAY")) {
				intMonth=5;break;}
			if(month.equals("JUNE")) {
				intMonth=6;break;}
			if(month.equals("JULY")) {
				intMonth=7;break;}
			if(month.equals("AUGUST")) {
				intMonth=8;break;}
			if(month.equals("AUGUST")) {
				intMonth=9;break;}
			if(month.equals("AUGUST")) {
				intMonth=10;break;}
			if(month.equals("NOVEMBER")) {
				intMonth=11;break;}
			if(month.equals("DECEMBER")) {
				intMonth=12;break;}
			else
			{
				System.out.println("Enter the proper Month in the correct format");
				month=sc.next();
				month= month.toUpperCase();
			}
		}
		calendar.set(year, intMonth-1, 1);
		int maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	
		System.out.println("The number of days in the month : "+maxDays);
		sc.close();
	}
			
		
		
		
}


