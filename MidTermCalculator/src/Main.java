import java.util.Scanner;

/**
 * <code>Calculator</code> program allows the performing of simple math
 * operations between two numbers. This program should not be used for
 * applications where high precision is needed.
 * 
 * @author Ray Keller mkeller1991@gmail.com
 * @version 1.0.1
 * @date May 2nd, 2018
 */
public class Main {

	/**
	 * The <code>main</main> method begins by prompting the user to turn on the
	 * calculator, which will instantiate the calculator object.
	 */
	public static void main(String[] args) {
		/**
		 * String that holds user input on first initializing application. Looking for
		 * "on"
		 */
		String typeOn;

		do {
			System.out.print("Type \"ON\" to begin calculator: ");
			Scanner scanner1 = new Scanner(System.in);
			typeOn = scanner1.nextLine();

		} while (!typeOn.equalsIgnoreCase("on"));

		Calculator calculator = new Calculator();
		// A new calculator object is called.
		calculator.beginCalculator();
		// The calculator begins.

	}

}
