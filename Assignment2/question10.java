import java.util.*;
public class question10 
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=sc.nextInt();
		int array[]=new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
			array[i]=sc.nextInt();
		
	for(int i=0;i<num-1;i++)
	{
		for(int j=0;i<=(num-i)-1;j++)
		{
			 if (array[j] > array[j+1]) 
             { 
                 int temp = array[j]; 
                 array[j] = array[j+1]; 
                 array[j+1] = temp; 
             } 
		}
	}
		
	}
}
