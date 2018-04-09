
public class Calculator extends Main {
	
	
	
	
	
	
	
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
