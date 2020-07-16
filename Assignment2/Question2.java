import java.util.*;
/*2. Write a program to count how many numbers of times each character appears/present in the given string.

Ex: given string = “hello word”

   Output:
     h.....1
     e.....1
     l......2
     o.....2
     w....1
     r.....1
     d...1*/
public class Question2 { 
	  
	    static void check(String string) 
	    { 
	         
	        int count[] = new int[256]; 
	  
	        int len = string.length(); 
	        for (int i = 0; i < len; i++) 
	            count[string.charAt(i)]++; 
	  
	        char ch[] = new char[string.length()]; 
	        for (int i = 0; i < len; i++) { 
	            ch[i] = string.charAt(i); 
	            int counter = 0; 
	            for (int j = 0; j <= i; j++)
	            { 
	            	if (string.charAt(i) == ch[j])  
	                    counter++;                 
	            } 
	  
	            if (counter == 1)  
	                System.out.println( string.charAt(i) + " .........." + count[string.charAt(i)]);             
	        } 
	    } 
	    public static void main(String[] args) 
	    { 
	        Scanner sc = new Scanner(System.in); 
	        System.out.println("Enter the string");
	        String str=sc.nextLine();
	        check(str); 
	        sc.close();
	    } 
}
