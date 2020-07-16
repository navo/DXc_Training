mport java.util.*;
public class question6 {
	 public static void main(String[] args)
	    {
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter number of rows: ");
	    int n = sc.nextInt();
	    for (int i= n; i>= 1; i--)
	    {
	    for (int j=n; j>i;j--)
	    {
	    System.out.print(" ");
	    }
	    for (int k=1;k<=i;k++)
	    {
	    System.out.print(k);
	    }
	    System.out.println("");
	    }
	    sc.close();
	    }
}
