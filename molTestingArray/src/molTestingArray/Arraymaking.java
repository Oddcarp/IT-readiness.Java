package molTestingArray;
import java.util.ArrayList;

public class Arraymaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String molFormArray[];
		String molNumberArray[];
		String molFormula = "Na1H3H1F2C1O4";
		ArrayList<String> molFormArrayList = new ArrayList<String>();
		ArrayList<String> molNumberArrayList = new ArrayList<String>();
		String curSubstring = null;
		
		
		for (int i = 0; i < molFormula.length(); i++) {
			char curChar = molFormula.charAt(i);
			for (int j = i+1; j < molFormula.length() ; j++ ) {
				if (Character.isUpperCase(molFormula.charAt(j))) {
					curSubstring = molFormula.substring(i, j);
					String curElement = curSubstring.replaceAll("[^A-Za-z]","");
					String curElementNumber = curSubstring.replaceAll("[^0-9]","");
					molFormArrayList.add(curElement);
					molNumberArrayList.add(curElementNumber);
					System.out.println(curElement + " " + curElementNumber);
					i = j-1;
					break;
				}					
			}	
		}
		
		
		
		
	}

}
