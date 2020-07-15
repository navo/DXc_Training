import java.util.*;
public class prog18 {
public static void main(String ar[])
{
	String[] array = new String[9];
	int ch=0;
	Scanner Sc=new Scanner(System.in);
	array[0]="One";
	array[1]="Two";
	array[2]="Three";
	array[3]="Four";
	array[4]="Five";
	array[5]="Six";
	array[6]="Seven";
	array[7]="Eight";
	array[8]="Nine";
	while(ch>=0){
	System.out.println("Enter a digit enter -1 to abort");
	ch=Sc.nextInt();
	if(ch==-1)
		break;
	
	System.out.println("The digit is : "+ array[ch-1]);
	}
	Sc.close();
}
}