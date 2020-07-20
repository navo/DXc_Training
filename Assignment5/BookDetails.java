
public class BookDetails {

	public static void main(String[] args) {
		Book ob=new Book();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Book No :");
		ob.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Title :");
		ob.setTitle(sc.nextLine());
		System.out.println("Enter Author");
		ob.setAuthor(sc.nextLine());
		System.out.println("Enter Price");
		ob.setPrice(sc.nextFloat());
		
		System.out.println("Book No :"+ob.getBookNo());
		System.out.println("Title : "+ob.getTitle());
		System.out.println("Author :"+ob.getAuthor());
		System.out.println("Price :"+ob.getPrice());
		EngineeringBook ob1=new EngineeringBook();
		
		System.out.println("Enter Book No :");
		ob1.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Category :");
		ob1.setCategory(sc.nextLine());
		System.out.println("Enter Title :");
		ob1.setTitle(sc.nextLine());
		System.out.println("Enter Author");
		ob1.setAuthor(sc.nextLine());
		System.out.println("Enter Price");
		ob1.setPrice(sc.nextFloat());
		System.out.println("Book No :"+ob1.getBookNo());
		System.out.println("Book Category :"+ob1.getCategory());
		System.out.println("Title : "+ob1.getTitle());
		System.out.println("Author :"+ob1.getAuthor());
		System.out.println("Price :"+ob1.getPrice());
	}

}
