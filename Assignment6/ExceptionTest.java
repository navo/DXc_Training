import java.util.*;

public class ExceptionTest {

	public static void main(String[] args) {
		int a=1, b=1; double c=1;
		try {
			a = Integer.parseInt(args[0]);
		} catch (Exception ex) {
			System.out.println("A number was not entered.");
			System.exit(0);
		}
		try {
			b = Integer.parseInt(args[1]);
		} catch (Exception ex) {
			System.out.println("A number was not entered.");
			System.exit(0);
		}
		try {
			c = a / b;
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception");
		}

	}

}
