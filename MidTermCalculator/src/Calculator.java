import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The main object where the calculator is controlled and logic is used.
 * <p>
 * All inputs and variables are stored here.
 * </p>
 */
public class Calculator extends Main {

	/**
	 * This string will hold the result of the solved equation.
	 */
	String finalValue;
	/**
	 * An array of messages to be displayed to the user to guide the use of the
	 * calculator
	 */
	String[] messages = { "Enter Command or First Number: ", "Enter an Operator: ",
			"Enter your Second Number or Mem: " };
	/**
	 * This string will hold the first number in the equation.
	 */
	String firstNumber = "";
	/**
	 * This string will hold the operator in the equation.
	 */
	String operator = "";
	/**
	 * A list of available operators
	 */
	String validOperators[] = { "+", "-", "*", "/", "%", "^", "~" };
	/**
	 * This string will hold the second number in the equation.
	 */

	String secondNumber = "";
	/**
	 * This Arraylist will hold any results saved by the user.
	 */
	ArrayList<String> savedResults = new ArrayList<String>();
	/**
	 * This Arraylist will hold all <code>Operation</code> objects.
	 */
	ArrayList<Operation> results = new ArrayList<Operation>();

	/**
	 * The <code>beginCalculator</code> method controls the progression the
	 * calculation.
	 * <p>
	 * This method controls the progression of the calculator from i = 0 (entering a
	 * first number or command) through i = 2 (entering a second number). The
	 * program only moves to the next step if an appropriate input is detected. *
	 */
	public void beginCalculator() {
		// The calculator has three steps, indexed at i = 0,1,2. At each step the user
		// is provided a message with
		// directions to progress the program.
		/**
		 * A counter variable
		 */
		int calculatorProgress = 0;
		Scanner scanner = new Scanner(System.in);

		while (calculatorProgress < 3) {

			if (calculatorProgress == 0) {
				// Asking for the first number or a command
				System.out.print(messages[calculatorProgress]);
				firstNumber = scanner.nextLine();
				firstNumber = checkCommands(firstNumber);
				if (checkDigit(firstNumber)) {
					// Calculator only progresses if the first input is a number.
					calculatorProgress++;
				}
			} else if (calculatorProgress == 1) {
				System.out.print(messages[calculatorProgress]);
				operator = scanner.nextLine();
				for (int j = 0; j < validOperators.length; j++) {
					if (operator.equals(validOperators[j])) {
						// Calculator only progresses if a valid operator is chosen.
						calculatorProgress++;
					}
				}
				if (operator.equalsIgnoreCase("ops")) {
					ops(operator);
				} else if (calculatorProgress == 1) {
					System.out.println("Please Select a Valid Operation, type OPS for a list");
				}

			} else if (calculatorProgress == 2) {
				System.out.print(messages[calculatorProgress]);
				secondNumber = scanner.nextLine();
				// The second number input has a limited number of commands that can be entered,
				// all of which return a numerical value
				if (secondNumber.equalsIgnoreCase("mem")) {
					secondNumber = mem(secondNumber);
				} else if (secondNumber.equalsIgnoreCase("pi")) {
					secondNumber = pi(secondNumber);
				} else if (secondNumber.equalsIgnoreCase("e")) {
					secondNumber = e(secondNumber);
				}
				if (checkDigit(secondNumber)) {
					// Again the calculator will not progress to the final stage unless a second
					// number is chosen.
					calculatorProgress++;
				}
			}

		}

		finalValue = calculate(firstNumber, operator, secondNumber);
		results.add(new Operation(firstNumber, operator, secondNumber, finalValue));
		// A new Operation object is constructed upon completion of a loop of the
		// calculator.
		this.beginCalculator();
		// It begins again

	}

	/**
	 * The <code>checkCommands</code> method checks the users input to see if one of
	 * the available commands is called.
	 * <p>
	 * If a string matches a command, an index call is made to parallel array of
	 * interfaces. The interface then calls the method associated with the users
	 * command.
	 * </p>
	 * 
	 * @param firstInput
	 * @return
	 */
	public String checkCommands(String firstInput) {
		/**
		 * A list of keywords to call a command.
		 */
		String arrayCommands[] = { "help", "save", "mem", "print", "off", "pi", "e" };
		/**
		 * A boolean for tracking if a command was found.
		 */
		boolean isRun = false;
		/**
		 * A string variable for holding either a command response or the input string
		 * if no command is called.
		 */
		String newFirstNumber = "";
		for (int j = 0; j < arrayCommands.length; j++) {
			if (firstInput.equalsIgnoreCase(arrayCommands[j])) {
				newFirstNumber = commandActions[j].command(firstInput);
				isRun = true;
			}
		}
		if (isRun == false) {
			// If no matching command is found, the original value is returned.
			newFirstNumber = firstInput;
		}
		return newFirstNumber;
	}

	/**
	 * An interface with a method for calling a command.
	 */
	interface CommandsInterface {
		String command(String input);
	}

	/**
	 * An array of calls for instantiating an anonymous class.
	 */
	private CommandsInterface commandActions[] = new CommandsInterface[] { new CommandsInterface() {
		public String command(String input) {
			return help(input);
		}
	}, new CommandsInterface() {
		public String command(String input) {
			return save(input);
		}
	}, new CommandsInterface() {
		public String command(String input) {
			return mem(input);
		}
	}, new CommandsInterface() {
		public String command(String input) {
			return print(input);
		}
	}, new CommandsInterface() {
		public String command(String input) {
			return off(input);
		}
	}, new CommandsInterface() {
		public String command(String input) {
			return pi(input);
		}
	}, new CommandsInterface() {
		public String command(String input) {
			return e(input);
		}
	} };

	/**
	 * The <code>HELP</code> method returns a list of commands for the user.
	 * 
	 * @param input
	 * @return
	 */
	public String help(String input) {
		System.out.println(
				"\nHere is a list of commands:\nSAVE\t- save previous result to memory\nMEM\t- display results saved to memory and select from a list\nPRINT\t- display all calculations performed\nOFF\t- terminates the calculator application\n");
		return input;
	}

	/**
	 * The <code>SAVE</code> method saves the result of the latest operation.
	 * 
	 * @param input
	 * @return
	 */
	public String save(String input) {
		if (finalValue != "" && finalValue != null) {
			// Only saves to the array if an operation has been performed.
			savedResults.add(String.valueOf(finalValue));
		} else {
			System.out.println("\nYou have no result to save\n");
		}
		return input;
	}

	/**
	 * /** of values saved by the user to be selected and returned as part of the
	 * operation in progress.
	 * 
	 * @param input
	 * @return newNumber The value selected by the user from the index of saved
	 *         values
	 */
	public String mem(String input) {
		/**
		 * A placeholder for the new number-value if selected
		 */
		String newNumber = input;

		if (savedResults.size() > 0) {
			System.out.println();
			/**
			 * String holder for users typed input.
			 */
			String indexSelectionString;
			/**
			 * An integer holder for parsing of the users index selection input
			 */
			int indexSelection;
			System.out.println(savedResults);
			System.out.print("\nSelect index of desired value (starting from 1): ");
			do {
				// Only returns values within the bounds of the index. Users cannot escape loop
				// until an in-bound selection is made.
				Scanner scannerMessages = new Scanner(System.in);
				indexSelectionString = scannerMessages.nextLine();
				indexSelection = Integer.parseInt(indexSelectionString) - 1;
				if (indexSelection < 0 || indexSelection > savedResults.size() - 1) {
					// The user will be alerted if they make a selection outside of the bounds.
					System.out.print(
							"\nThe index you chosen is not within bounds!\nSelect index of desired value (starting from 1):");
				}

			} while (indexSelection < 0 || indexSelection >= savedResults.size());
			newNumber = savedResults.get(indexSelection);
			System.out.println();
			System.out.println("Your Number is: " + newNumber);
		}
		return newNumber;
	}

	/**
	 * The <code>PRINT</code> command returns a list of all operation objects that
	 * have been constructed.
	 * 
	 * @param input
	 * @return
	 */
	public String print(String input) {
		System.out.println();
		if (!results.isEmpty()) {
			// Only prints if results ArrayList is not empty.
			for (int k = 0; k < results.size(); k++)
				System.out.println(results.get(k));
		}
		System.out.println();
		return input;
	}

	/**
	 * The <code>OFF</code> command terminates the program.
	 * 
	 * @param input
	 * @return
	 */
	public String off(String input) {
		System.out.println("Thanks for using Calculator!");
		System.exit(0);
		return input;
	}

	/**
	 * The <code>OPS</code> command returns a list of all operators that can be used
	 * by the calculator.
	 * 
	 * @param input
	 * @return
	 */
	public String ops(String input) {
		System.out.println();
		for (String x : validOperators) {
			System.out.println(x);
		}
		System.out.println();
		return input;
	}

	/**
	 * The <code>PI</code> command returns the value of pi if entered in a number
	 * selection.
	 * 
	 * @param input
	 * @return pi the value of pi to 4 digits.
	 */
	public String pi(String input) {
		/**
		 * The value of pi formatted and converted to a string.
		 */
		String newNumber = String.format("%.4f", Math.PI);
		return newNumber;
	}

	/**
	 * The <code>E</code> command returns the value of e if entered in a number
	 * selection.
	 * 
	 * @param input
	 * @return e the value of e to 4 digits.
	 */
	
	public String e(String input) {
		/**
		 * The value of e formatted and converted to a string.
		 */
		String newNumber = String.format("%.4f", Math.E);
		return newNumber;
	}

	/**
	 * The final step of the calculator is executing the operation
	 * <p>
	 * When all three parts of an equation have been entered, they are passed to the
	 * calculate() method for conversion to the double type and performing of the
	 * operation. The result is then converted to a string type before being
	 * returned to be encapsulated with its products.
	 * </p>
	 * 
	 * @param firstNumber
	 *            The first number
	 * @param operator
	 *            The operator
	 * @param secondNumber
	 *            The second number
	 * @return finalValueString The calculated value of the equation converted to
	 *         string.
	 */
	public String calculate(String firstNumber, String operator, String secondNumber) {

		/**
		 * The first number converted to a double.
		 */
		double doubleFirstNumber = Double.parseDouble(firstNumber);
		/**
		 * The second number converted to a double.
		 */
		double doubleSecondNumber = Double.parseDouble(secondNumber);
		/**
		 * The final value holder.
		 */
		double finalValue = 0;
		/**
		 * The final value holder for string conversion.
		 */
		String finalValueString;

		switch (operator) {

		case "+":
			finalValue = doubleFirstNumber + doubleSecondNumber;
			break;
		case "-":
			finalValue = doubleFirstNumber - doubleSecondNumber;
			break;
		case "*":
			finalValue = doubleFirstNumber * doubleSecondNumber;
			break;
		case "/":
			finalValue = doubleFirstNumber / doubleSecondNumber;
			break;
		case "%":
			finalValue = doubleFirstNumber % doubleSecondNumber;
			break;
		case "^":
			finalValue = Math.pow(doubleFirstNumber, doubleSecondNumber);
			break;
		case "~":
			finalValue = Math.pow(doubleFirstNumber, (1 / doubleSecondNumber));
			break;
		default:

		}

		finalValueString = String.valueOf(finalValue);
		finalValueString = String.format("%.4f", finalValue);
		System.out.println(finalValueString);
		System.out.println();
		return finalValueString;

	}

	/**
	 * The <code>checkDigit</code> method is a regular expression method for
	 * determining whether a string value contains a double.
	 * 
	 * @param input
	 * @return
	 */
	public boolean checkDigit(String input) {
		/**
		 * Shows whether the input string is a digit.
		 */
		boolean isDouble = false;

		// Following method found in Oracle Java Documentation at
		// https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html
		final String Digits = "(\\p{Digit}+)";
		final String HexDigits = "(\\p{XDigit}+)";
		// an exponent is 'e' or 'E' followed by an optionally
		// signed decimal integer.
		final String Exp = "[eE][+-]?" + Digits;
		final String fpRegex = ("[\\x00-\\x20]*" + // Optional leading "whitespace"
				"[+-]?(" + // Optional sign character
				"NaN|" + // "NaN" string
				"Infinity|" + // "Infinity" string

				// A decimal floating-point string representing a finite positive
				// number without a leading sign has at most five basic pieces:
				// Digits . Digits ExponentPart FloatTypeSuffix
				//
				// Since this method allows integer-only strings as input
				// in addition to strings of floating-point literals, the
				// two sub-patterns below are simplifications of the grammar
				// productions from section 3.10.2 of
				// The Java Language Specification.

				// Digits ._opt Digits_opt ExponentPart_opt FloatTypeSuffix_opt
				"(((" + Digits + "(\\.)?(" + Digits + "?)(" + Exp + ")?)|" +

				// . Digits ExponentPart_opt FloatTypeSuffix_opt
				"(\\.(" + Digits + ")(" + Exp + ")?)|" +

				// Hexadecimal strings
				"((" +
				// 0[xX] HexDigits ._opt BinaryExponent FloatTypeSuffix_opt
				"(0[xX]" + HexDigits + "(\\.)?)|" +

				// 0[xX] HexDigits_opt . HexDigits BinaryExponent FloatTypeSuffix_opt
				"(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +

				")[pP][+-]?" + Digits + "))" + "[fFdD]?))" + "[\\x00-\\x20]*");// Optional trailing "whitespace"

		if (Pattern.matches(fpRegex, input) || Pattern.matches(Digits, input)) {
			// Testing the input against two patterns, only one match required to return
			// true.
			isDouble = true;
		}

		return isDouble;
	}

}
