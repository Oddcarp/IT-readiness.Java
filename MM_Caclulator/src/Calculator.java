import java.util.HashMap;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter Your Molecular Formula: ");
		String userFormula = scanner1.nextLine();
		System.out.println("");

		System.out.println("Atom" + "\t" + "Number" + "\t" + "Atomic Mass");
		String strResult = String.format("%.4f", massCalculator(userFormula));
		System.out.println("");
		System.out.println("Molecular Weight: " + strResult);

	}

	public static double massCalculator(String x) {

		HashMap<String, Double> hmap = new HashMap<String, Double>();
		hmap.put("H", 1.0080);
		hmap.put("He", 4.0026);
		hmap.put("Li", 6.9675);
		hmap.put("Be", 9.0122);
		hmap.put("B", 10.8135);
		hmap.put("C", 12.0106);
		hmap.put("N", 14.0069);
		hmap.put("O", 15.9994);
		hmap.put("F", 18.9984);
		hmap.put("Ne", 20.1797);
		hmap.put("Na", 22.9898);
		hmap.put("Mg", 24.3055);
		hmap.put("Al", 26.9815);
		hmap.put("Si", 28.0850);
		hmap.put("P", 30.9738);
		hmap.put("S", 32.0675);
		hmap.put("Cl", 35.4515);
		hmap.put("Ar", 39.9480);
		hmap.put("K", 39.0983);
		hmap.put("Ca", 40.0780);
		hmap.put("Sc", 44.9559);
		hmap.put("Ti", 47.8670);
		hmap.put("V", 50.9415);
		hmap.put("Cr", 51.9961);
		hmap.put("Mn", 54.9380);
		hmap.put("Fe", 55.8450);
		hmap.put("Co", 58.9332);
		hmap.put("Ni", 58.6934);
		hmap.put("Cu", 63.5460);
		hmap.put("Zn", 65.3800);
		hmap.put("Ga", 69.7230);
		hmap.put("Ge", 72.6300);
		hmap.put("As", 74.9216);
		hmap.put("Se", 78.9710);
		hmap.put("Br", 79.9040);
		hmap.put("Kr", 83.7980);
		hmap.put("Rb", 85.4678);
		hmap.put("Sr", 87.6200);
		hmap.put("Y", 88.9058);
		hmap.put("Zr", 91.2240);
		hmap.put("Nb", 92.9064);
		hmap.put("Mo", 95.9500);
		hmap.put("Tc", 98.0000);
		hmap.put("Ru", 101.0700);
		hmap.put("Rh", 102.9055);
		hmap.put("Pd", 106.4200);
		hmap.put("Ag", 107.8682);
		hmap.put("Cd", 112.4140);
		hmap.put("In", 114.8180);
		hmap.put("Sn", 118.7100);
		hmap.put("Sb", 121.7600);
		hmap.put("Te", 127.6000);
		hmap.put("I", 126.9045);
		hmap.put("Xe", 131.2930);
		hmap.put("Cs", 132.9055);
		hmap.put("Ba", 137.3270);
		hmap.put("La", 138.9055);
		hmap.put("Ce", 140.1160);
		hmap.put("Pr", 140.9077);
		hmap.put("Nd", 144.2420);
		hmap.put("Pm", 145.0000);
		hmap.put("Sm", 150.3600);
		hmap.put("Eu", 151.9640);
		hmap.put("Gd", 157.2500);
		hmap.put("Tb", 158.9254);
		hmap.put("Dy", 162.5000);
		hmap.put("Ho", 164.9303);
		hmap.put("Er", 167.2590);
		hmap.put("Tm", 168.9342);
		hmap.put("Yb", 173.0540);
		hmap.put("Lu", 174.9668);
		hmap.put("Hf", 178.4900);
		hmap.put("Ta", 180.9479);
		hmap.put("W", 183.8400);
		hmap.put("Re", 186.2070);
		hmap.put("Os", 190.2300);
		hmap.put("Ir", 192.2170);
		hmap.put("Pt", 195.0840);
		hmap.put("Au", 196.9666);
		hmap.put("Hg", 200.5920);
		hmap.put("Tl", 204.3835);
		hmap.put("Pb", 207.2000);
		hmap.put("Bi", 208.9804);
		hmap.put("Po", 209.0000);
		hmap.put("At", 210.0000);
		hmap.put("Rn", 222.0000);
		hmap.put("Fr", 223.0000);
		hmap.put("Ra", 226.0000);
		hmap.put("Ac", 227.0000);
		hmap.put("Th", 232.0377);
		hmap.put("Pa", 231.0359);
		hmap.put("U", 238.0289);
		hmap.put("Np", 237.0000);
		hmap.put("Pu", 244.0000);
		hmap.put("Am", 243.0000);
		hmap.put("Cm", 247.0000);
		hmap.put("Bk", 247.0000);
		hmap.put("Cf", 251.0000);
		hmap.put("Es", 252.0000);
		hmap.put("Fm", 257.0000);
		hmap.put("Md", 258.0000);
		hmap.put("No", 259.0000);
		hmap.put("Lr", 262.0000);
		hmap.put("Rf", 267.0000);
		hmap.put("Db", 268.0000);
		hmap.put("Sg", 271.0000);
		hmap.put("Bh", 272.0000);
		hmap.put("Hs", 270.0000);
		hmap.put("Mt", 276.0000);
		hmap.put("Ds", 281.0000);
		hmap.put("Rg", 280.0000);
		hmap.put("Cn", 285.0000);
		hmap.put("Nh", 284.0000);
		hmap.put("Fl", 289.0000);
		hmap.put("Mc", 288.0000);
		hmap.put("Lv", 293.0000);
		hmap.put("Ts", 292.0000);
		hmap.put("Og", 294.0000);


		String molFormula = x;
		char nexChar;
		char doubNexChar;
		double molWeight = 0;

		String tempFormula;
		StringBuilder sb;
		String parenthesesFormula = " ";
		double parenthesesMass;
		int parenthesesNumber = 1;
		double massWithoutParantheses;
		boolean isParentheses = false;
		
		for (int i = 0; i < molFormula.length() ; i++) {

			char curChar = molFormula.charAt(i);
			int molNum = 1;

			if (i < (molFormula.length()-1)) {
				nexChar = molFormula.charAt(i+1);
			} else {nexChar = '1';}

			if (i < (molFormula.length()-2)) {
				doubNexChar = molFormula.charAt(i+2);
			} else {doubNexChar = '1';}



			if (Character.isUpperCase(curChar)){

				if (Character.isLowerCase(nexChar)) {

					sb = new StringBuilder(3);
					sb.append(curChar);
					sb.append(nexChar);
					tempFormula = sb.toString();

					if (Character.isDigit(doubNexChar)) {

						molNum = Character.getNumericValue(doubNexChar);
						if (hmap.get(tempFormula) != null) {
							System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
							molWeight += (hmap.get(tempFormula) * molNum);
						}

					} else {
						
						if (hmap.get(tempFormula) != null) {
							System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
							molWeight += (hmap.get(tempFormula) * molNum);
						}
					}

				} else if (Character.isDigit(nexChar)) {
					
					tempFormula = Character.toString(curChar);
					molNum = Character.getNumericValue(nexChar);
					if (hmap.get(tempFormula) != null) {
						
						System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
						molWeight += (hmap.get(tempFormula) * molNum);
					}

				} else {
					tempFormula = Character.toString(curChar);
					if (hmap.get(tempFormula) != null) {
						System.out.println(tempFormula + "\t" + molNum + "\t" + hmap.get(tempFormula));
						molWeight += (hmap.get(tempFormula) * molNum);
					}
				}
			} else if (curChar == '(') {
				isParentheses = true;
				parenthesesNumber = 1;
				parenthesesFormula = molFormula.substring(molFormula.indexOf("(")+1,molFormula.indexOf(")"));
				i += parenthesesFormula.length();
				if (molFormula.length() != molFormula.indexOf(")") + 1) {
					parenthesesNumber = molFormula.indexOf(")") + 1;
					parenthesesNumber = Character.getNumericValue(molFormula.charAt(molFormula.indexOf(")") + 1));
				}		
			}
		}
		
		if (isParentheses) {
			massWithoutParantheses = molWeight;
			parenthesesMass = massCalculator(parenthesesFormula);
			molWeight = massWithoutParantheses + (parenthesesMass * parenthesesNumber);
		}
		return molWeight;
	}

}
