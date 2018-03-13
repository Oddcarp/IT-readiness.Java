
public class Molecule extends Calculator {

	public String molFormula;
	public double molWeight;
	public int numberParentheses;
	public boolean hasParentheses;
	public String[] partialFormulas;
	public int[] partialFormulasNumbers;
	
	public void newMolecule(String a) {
		molFormula = a;
		numberParentheses = parenthesesCalculator(molFormula);
		if (numberParentheses > 0) {hasParentheses = true;}
		
	}
	
	public int parenthesesCalculator(String a) {
		
		String tempFormula = a;
		int countParentheses = 0;
		for (int i = 0; i < tempFormula.length(); i++) {
			char ch = tempFormula.charAt(i);
			if ('(' == ch) {
				countParentheses++;
			}
		}
		
		return countParentheses;
		
	}


	
}
