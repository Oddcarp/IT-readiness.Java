import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double finalValue;
		String typeOn;
		
		do {
			System.out.println("Type \"ON\" to begin calculator: ");
			Scanner scanner1 = new Scanner(System.in);
			typeOn = scanner1.nextLine();
			
		} while (!typeOn.equalsIgnoreCase("on"));
		
		
		Calculator calculator = new Calculator();
		 finalValue = calculator.beginCalculator();
		System.out.println(finalValue);

	}
	
	


}
