import java.lang.Math;
import java.util.Scanner;

public class ConstantsTesting {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MY_CONSTANT = 7; //declaration and initialization 
		double myVariable = 23;
		
	//	myVariable ++; //assignment

		int myVariable2 = 5;
		double myTotal = 0;
		
	//	myTotal = (myVariable + myVariable2) + 1;
			
		myTotal = Math.PI;
		System.out.println(myTotal);
		
		String firstName = "John";
		String lastName;
		String fullName;
		char middleInitial = 'F';

		fullName = firstName;
		fullName += " ";
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Please enter your last name: ");
		lastName = scanner1.nextLine();
		fullName += middleInitial + " ";
		fullName += lastName;
		System.out.println(fullName);
	}

}
