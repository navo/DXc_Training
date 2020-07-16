import java.util.*;
//Write a program to remove duplicate elements from the array of integers.
public class Q1 {
public static void main(String ar[]) 
{	int num;
	int array[]=new int[100];
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements");
	num=sc.nextInt();
	System.out.println("Enter the elements");
	for(int i=0;i<num;i++)
		array[i]=sc.nextInt();
	for(int i=0;i<num;i++)
	System.out.println(array[i]);
	int count=0;
	for(int i=0;i<num-1;i++)
	{
		for(int j=0;i<=num-i-1;j++)
		{
			 if (array[j] > array[j+1]) 
             { 
                 int temp = array[j]; 
                 array[j] = array[j+1]; 
                 array[j+1] = temp; 
             } 
		}
		
	}
	 for (int i = 0; i < num-1; i++) 
         if (array[i] != array[i+1]) 
             array[count++] = array[i]; 
    
     array[count++] = array[num-1]; 
	
}
}
