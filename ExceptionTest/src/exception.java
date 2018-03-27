import java.io.EOFException;
import java.io.IOException;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator = 100;
		int denominator = 10;
		
		try {
			System.exit(0);
			System.out.println(numerator/denominator);		
			throw new IOException("File not found"); 
		} catch (ArithmeticException | EOFException e) {
			System.out.println("Division by zero, buddy!!!");			
		} catch (Exception e) {
			System.out.println("Unhandled Exception : " + e.getMessage());
		} finally {
			// close any open but unneeded resources here
			System.out.println("Inside the 'finally' bock");
		}
	}

}
