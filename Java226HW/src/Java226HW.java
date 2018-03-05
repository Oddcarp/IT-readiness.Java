import java.util.Scanner;

public class Java226HW {
	/**
	 * This <code>Java226HW</code> application determines if a string is a number
	 * @author Ray Keller
	 * @Version 1.0
	 * @date February 26, 2018
	 * @param args[] passed in from the command line
	 * @returns void/nothing
	 * @see
	 */
	
	
	public static void main(String[] ap) {
		// TODO Auto-generated method stub
		 String aNumber = "42"; // not argv[1]
		 double result;
		 try {
			 result = Double.parseDouble(aNumber);
			 System.out.println("Number is " + result);
		 } catch(NumberFormatException exc) {
			 System.out.println("Invalid number " + aNumber);
		 return;
		 }
		 

		 
		 String myString1 = "Ray";
		 String myString2 = "Lastname";
		 System.out.printf("\nLength of %s: %d", myString1, myString1.length());
//		 System.out.printf("\nCharacter at position 4 is %c", myString1.charAt(1));
//		 System.out.printf("\n%s", myString1.substring(5,9));
		 System.out.print("\n");
		 
		 Scanner scanner1 = new Scanner(System.in);
			System.out.print("Please enter your first name: ");
			myString1 = scanner1.nextLine();
		 
		 

		 
		 for (int i = myString1.length()-1; i >= 0; i--) {
			 System.out.print(myString1.charAt(i));		 
		 }
		 
		 System.out.println("");
		 char curChar;
		 String reverseName = "";
		 
		 for (int i = myString1.length()-1; i >= 0; i--) {
			 curChar = myString1.charAt(i);		 
			 reverseName = reverseName + curChar;
		 }
		 System.out.println(reverseName);
		 
		 reverseName = "";
		 
		 
		 for (int i = 0; i <= myString1.length()-1; i++) {
			 curChar = myString1.charAt(i);		 
			 reverseName = curChar + reverseName;
		 }
		 
		 System.out.println(reverseName);
		 System.out.println("");
		 
		 String aString1 = "Hello!";
		 String aString2 = "hello!";
		 
		 System.out.printf("%s.equals(%s):%b%n", aString1, aString2, (aString1.equals(aString2)));
		 System.out.printf("%s == %s:%b%n", aString1, aString2, (aString1==aString2));
		 System.out.printf("%s.toUpperCase().equals(%s.toUpperCase()):%b%n", aString1, aString2, (aString1.toUpperCase().equals(aString2.toUpperCase())));
		 System.out.printf("%s.equalsIgnoreCase(%s):%b%n", aString1, aString2, (aString1.equalsIgnoreCase(aString2)));
		 System.out.println(aString1.replace('l', 'x'));
		 System.out.println(aString1);
		 System.out.println(aString1.concat(aString2 + "!"));
		 System.out.println(aString1.indexOf("l",3));
		 System.out.printf("%s, %b, %d, %f, %c", "!!!", true, 23, 5.45, 'x');
		 System.out.printf("%s, %s, %s, %s, %s", "!!!", true, 23, 5.45, 'x');
		 System.out.printf("%s, %s, %s, %s, %s", "!!!", String.valueOf(true), String.valueOf(23), String.valueOf(5.45), String.valueOf('x'));
		 
		 System.out.println("");
		 System.out.println(calculateTotal(10.00f,0.10f,0.05f));
		 System.out.println(calculateTotal(100.00f,0.15f,0.10f));
		 System.out.println(toUpperCaseAndTrim("      hello!      "));
	}
	
	public static float calculateTotal(float purchaseTotal, float stateSalesTax, float countySalesTax) {
		float tempTotal = purchaseTotal;
		tempTotal += (stateSalesTax * purchaseTotal) + (countySalesTax * purchaseTotal);
		return tempTotal;
	}
	
	public static String toUpperCaseAndTrim(String x) {
		String newString = x;
		newString = newString.trim();
		newString = newString.toUpperCase();
		return newString;
	}
	

}	


