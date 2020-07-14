
//print prime numbers between 2 to 100
public class prog10 {
	public static void main(String args[])
	{
		int flag=0;
		for(int i=2;i<=200;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(i);
			else
				flag=0;
		
		}
	}

}
