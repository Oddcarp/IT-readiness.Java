import java.util.Scanner;

public class Calculator extends Main {
	
	
	double finalValue;
	String[] messages = {"Enter Command or First Number: ", "Enter an Operator: ", "Enter your Second Number: "};
	String firstNumber = "";
	String operator = "";
	String secondNumber = "";
	
	public double beginCalculator() {
		int i = 0;
		while ( i < 3) {
	
		
			if (i==0) {
				System.out.print(messages[i]);
				Scanner scanner1 = new Scanner(System.in);
				firstNumber = scanner1.nextLine();
				i++;
			} else if (i == 1) {
				System.out.print("Enter an Operator: ");
				Scanner scanner2 = new Scanner(System.in);
				operator = scanner2.nextLine();
				i++;
			} else if (i == 2) {
				System.out.print("Enter your Second Number: ");
				Scanner scanner3 = new Scanner(System.in);
				secondNumber = scanner3.nextLine();
				
				i++;
			}
		
		}
		
		finalValue = calculate(firstNumber,operator,secondNumber);
		return finalValue;
	
	}
	
	
	
	
	public double calculate(String firstNumber, String operator, String secondNumber) {
		
		double doubleFirstNumber = Double.parseDouble(firstNumber);
		double doubleSecondNumber = Double.parseDouble(secondNumber);
		double finalValue = 0;
		
		
			
		
		switch (operator) {
		
		case "+" :
			finalValue = doubleFirstNumber + doubleSecondNumber;
			break;
		case "-" :
			finalValue = doubleFirstNumber - doubleSecondNumber;
			break;
		case "*" :
			finalValue = doubleFirstNumber * doubleSecondNumber;
			break;
		case "/" :
			finalValue = doubleFirstNumber / doubleSecondNumber;
			break;
		case "%" :
			finalValue = doubleFirstNumber % doubleSecondNumber;
			break;
		case "^" :
			finalValue = Math.pow(doubleFirstNumber,doubleSecondNumber);
			break;
		case "~" :
			finalValue = Math.pow(doubleFirstNumber, (1/doubleSecondNumber));
			break;
		default :
		
		}
		

		
		return finalValue;
		
		
		
	}
	
	

}
