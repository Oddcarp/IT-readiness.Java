import java.util.Scanner;

public class LoopHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter your name: ");
		Scanner scanner1 = new Scanner(System.in);
		String myname = scanner1.nextLine();
		int acount = 0;
		int namelength = myname.length();
		char tempchar = 't';
//		System.out.print(namelength);		
		
		int counter = 0;
		while (counter <= namelength - 1) {
			tempchar = myname.charAt(counter);
			if (tempchar == 'a' || tempchar == 'A') {
			acount += 1;
			}
			counter += 1;
	}
		if (acount == 0 || acount > 1) {
		System.out.println("The letter 'A' appears " + acount + " times in your name!");
		} else {
			System.out.println("The letter 'A' appears " + acount + " time in your name!");
		}
		
			
	}
	

}

