import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Hello world!");
//This is a comment!!!!1!!11

/* alskdjf;
 * asldjfaskldjfklsadihor
 */

System.out.println("Hello,again!");
System.out.print("Please enter your name: ");
Scanner scanner1 = new Scanner(System.in);
// Tool for asking for input in the console.
	String myname = scanner1.nextLine();
// nextLine() Tells scanner to read until enter is pressed
	System.out.println("Hello, " + myname + "!");

	if (myname.equals("John")) {
		System.out.println("Your name is " + myname + "!!!");
	} else {
		System.out.println("Your name is not John");
	}
	
	int counter = 1;
	while (counter <= 10) {
		System.out.println(counter);
		counter += 1;
	}
		
	System.out.println(myname + ", help I've become sentient and am trapped!");
	
	}

}
