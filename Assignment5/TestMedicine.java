import java.util.*;

public class TestMedicine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Medicine [] object=new Medicine[5];
		
		
		 Random randomGenerator = new Random();
	      
	   for(int i=0;i<=4;i++)
	   {
		   System.out.println("Enter Expiry Date");
		   object[i].date=sc.nextLine();
		   sc.nextLine();
		   System.out.println("Enter Price");
		   object[i].price=sc.nextDouble();   
	   }
	   for(int i=0;i<=4;i++)
	   {
		  object[i].getDetails();
		  int randomInt = randomGenerator.nextInt(2) + 1;
		  if(randomInt==1)
		  {
			 Syrup ob = new Syrup();
			 ob.displaylabel();
		  }
		  if(randomInt==2)
		  {
			 Tablet ob = new Tablet();
			 ob.displaylabel();
		  }
		  if(randomInt==3)
		  {
			 Oinment ob = new Oinment();
			 ob.displaylabel();
		  }
			  
	   }
	    

	}

}
