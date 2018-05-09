
/**
 * The <code>Operation</code> class Encapsulates all parts of an operation
 * within an object that can be stored easily in an ArrayList.
 *
 */
public class Operation {
	/**
	 * The first number of the operation.
	 */
	String firstNumber;
	/**
	 * The operator of the operation.
	 */
	String operator;
	/**
	 * The second number of the operation.
	 */
	String secondNumber;
	/**
	 * The result of the operation.
	 */
	String result;

	/**
	 * The constructor method for the Operation class.
	 * 
	 * @param firstNumber
	 * @param operator
	 * @param secondNumber
	 * @param result
	 */
	public Operation(String firstNumber, String operator, String secondNumber, String result) {
		this.firstNumber = firstNumber;
		this.operator = operator;
		this.secondNumber = secondNumber;
		this.result = result;
	}

	/**
	 * The <code>toString</code> method overwrites the default method in the Java
	 * Object Class.
	 */
	@Override
	public String toString() {
		String newString = firstNumber + " " + operator + " " + secondNumber + " = " + result;
		return newString;
	}

}
