import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.print("Enter your First Number: ");
		Scanner scanner1 = new Scanner(System.in);
		String firstNumber = scanner1.nextLine();
		
		
		System.out.print("Enter an Operator: ");
		Scanner scanner2 = new Scanner(System.in);
		String operator = scanner2.nextLine();
		
		System.out.print("Enter your Second Number: ");
		Scanner scanner3 = new Scanner(System.in);
		String secondNumber = scanner3.nextLine();
		
		Calculator calculator = new Calculator();
		double finalValue = calculator.calculate(firstNumber, operator, secondNumber);
		
		
		System.out.println(finalValue);

	}
	
	


}
