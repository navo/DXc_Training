import java.util.*;
public class question7 {
public static void main(String ar[])
{
	for(int i=5;i>=1;i--)
	{
		for(int j=i-1;j>=1;j--)
			System.out.print(" ");
		for(int k=i;k<=5;k++)
			System.out.print(k);
		for(int l=i;l<=4;l++)
			System.out.print(l);
		System.out.println("");
	}
}

}
