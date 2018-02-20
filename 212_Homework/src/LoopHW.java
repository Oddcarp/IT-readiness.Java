import java.util.Scanner;

public class LoopHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter your first name: ");
		Scanner scanner1 = new Scanner(System.in);
		String firstName = scanner1.nextLine();
		System.out.print("Please enter your middle initial: ");
		
		Scanner scanner2 = new Scanner(System.in);
		String middleInitial = scanner1.nextLine();
		System.out.print("Please enter your last name: ");
		
		Scanner scanner3 = new Scanner(System.in);
		String lastName = scanner1.nextLine();
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		
		int aCount = 0;
		int namelength = firstName.length();
		char tempChar = 't';
//		System.out.print(namelength);		
		
		
		
		int counter = 0;
		while (counter <= namelength - 1) {
			tempChar = firstName.charAt(counter);
			if (tempChar == 'a' || tempChar == 'A') {
				aCount += 1;
			}
			counter += 1;
		}
		
		
		
		
		if (aCount == 0 || aCount > 1) {
			System.out.println("The letter 'A' appears " + aCount + " times in your first name!");
		} else {
			System.out.println("The letter 'A' appears " + aCount + " time in your first name!");
		}
		
		System.out.println("Your full name is: " + fullName);
	}
	
	
}


