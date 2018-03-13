import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.lang3.StringUtils;

public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This <code>TruthTable</code> application does blank
		 * @author Ray Keller
		 * @Version 1.0
		 * @date February 17, 2018
		 * @param args[] passed in from the command line
		 * @returns void/nothing
		 * @see
		 */
		
		boolean a = true;
		boolean b = true;
		
/*		int c = 5;
		int d = 10;
		String myName = " JOHN ";
		if (myName.trim().toLowerCase().equals("john")) {
			System.out.println("My name is John");
		} else {
			System.out.println("My name is not John");
		}
*/				

		System.out.println("a" + "\t" + "b" + "\t" + "a&b" + "\t" + "a|b" + "\t" + "a&&b" + "\t" + "a||b" + "\t" + "a^b" + "\t" + "a==b" + "\t" + "a!=b" + "\t" + "!a" + "\t" + "!b");
		
		String[] headingsA = new String[] {"a","b","a&b","a|b","a&&b","a||b","a^b","a==b","a|=b","!a","!b"};
//		DefaultTableModel dtm = DefaultTableModel(headingsA,5);
//		Object[][] data;

//		JTable table = new JTable(data, headings);
//		Object[][] testObjecta;
		Object [][] testObject = new Object [4][11];
		int i = 0;
		while (i<4) {
			if (i == 1) {
				b = false;
			} else if (i == 2) {
				a = false;
				b = true;
			} else if (i == 3) {
				b = false;
			}
			
//		boolean answerA = a;
//		boolean answerB = b;
		boolean answer1 = a&b;
		boolean answer2 = a|b;
		boolean answer3 = a&&b;
		boolean answer4 = a||b;
		boolean answer5 = a^b;
		boolean answer6 = a==b;
		boolean answer7 = a!=b;
		boolean answer8 = !a;
		boolean answer9 = !b;
		
/*		String sAnswerA = String.valueOf(answerA);
		String sAnswerB = String.valueOf(answerB);
		String sAnswer1 = String.valueOf(answer1);
		String sAnswer2 = String.valueOf(answer2);
		String sAnswer3 = String.valueOf(answer3);
		String sAnswer4 = String.valueOf(answer4);
		String sAnswer5 = String.valueOf(answer5);
		String sAnswer6 = String.valueOf(answer6);
		String sAnswer7 = String.valueOf(answer7);
		String sAnswer8 = String.valueOf(answer8);
		String sAnswer9 = String.valueOf(answer9);
*/		
		System.out.println(a + "\t" + b + "\t" + answer1 + "\t" + answer2 + "\t" + answer3 + "\t" + answer4 + "\t" + answer5 + "\t" + answer6 + "\t" + answer7 + "\t" + answer8 + "\t" + answer9);
//		System.out.println(sAnswerA);
		
		
//		boolean[][] multiRow = new boolean[5][11];
//		boolean[] row = new boolean[] {a,b,answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9};
//		String[] sRow = new String[] {sAnswerA,sAnswerB,sAnswer1,sAnswer2,sAnswer3,sAnswer4,sAnswer5,sAnswer6,sAnswer7,sAnswer8,sAnswer9};
		
		
		
//		for (int j = 0; j < sRow.length; j++) {

			testObject[i][0]=a;
			testObject[i][1]=b;
			testObject[i][2]=answer1;
			testObject[i][3]=answer2;
			testObject[i][4]=answer3;
			testObject[i][5]=answer4;
			testObject[i][6]=answer5;
			testObject[i][7]=answer6;
			testObject[i][8]=answer7;
			testObject[i][9]=answer8;
			testObject[i][10]=answer9;
//		}

//		String[] row = new String[] {String.valueOf(a),String.valueOf(b),String.valueOf(answer1),String.valueOf(answer2),String.valueOf(answer3),String.valueOf(answer4),String.valueOf(answer5),String.valueOf(answer6),String.valueOf(answer7),String.valueOf(answer8),String.valueOf(answer9)};
//		String[] row = new String[] {Arrays.toString(row)};
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		model.addRow(row);
//		System.out.println(Arrays.toString(row));
//		String row2 = Arrays.toString(row);
//		System.out.println(row2);
		
		i++;
		
/*		if (i==0) {
			String[] row1 = new String[] {sAnswerA,sAnswerB,sAnswer1,sAnswer2,sAnswer3,sAnswer4,sAnswer5,sAnswer6,sAnswer7,sAnswer8,sAnswer9};
	//		JTable table = new JTable(boolean[], String[]);
	//		dtm.insertRow(0, row1);
			String row1s = Arrays.toString(row1);
		} if (i==1) {
			String[] row2 = new String[] {sAnswerA,sAnswerB,sAnswer1,sAnswer2,sAnswer3,sAnswer4,sAnswer5,sAnswer6,sAnswer7,sAnswer8,sAnswer9};
			String row2s = Arrays.toString(row2);
	//		dtm.insertRow(1, row2);
		} if (i==2) {
			String[] row3 = new String[] {sAnswerA,sAnswerB,sAnswer1,sAnswer2,sAnswer3,sAnswer4,sAnswer5,sAnswer6,sAnswer7,sAnswer8,sAnswer9};
			String row3s = Arrays.toString(row3);
	//		dtm.insertRow(2, row3);
		} if (i==3) {
			String[] row4 = new String[] {sAnswerA,sAnswerB,sAnswer1,sAnswer2,sAnswer3,sAnswer4,sAnswer5,sAnswer6,sAnswer7,sAnswer8,sAnswer9};
			String row4s = Arrays.toString(row4);
	//		dtm.insertRow(3, row4);
		}
*/
		}

		
	        final JFrame frame = new JFrame("JTable Demo");
	 

	 
	        JTable table = new JTable(testObject, headingsA);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Truth Table");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,36));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	    

			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Enter Your Molecular Formula: ");
			String userFormula = scanner1.nextLine();
			System.out.println("");

			
			
			String[] Test = StringUtils.substringsBetween(userFormula, "(", ")");
			System.out.println(Arrays.toString(Test));
			
			String finalFormula = "";
			for (int j = 0; j <userFormula.length(); j++ ) {				
				char curChar = userFormula.charAt(j);
				if (curChar == '(') {
					userFormula = parenExtract(j,userFormula);	
				}
			
			}
			
			System.out.println(userFormula);
			
	
		
		
		
	}
		
	public static String parenExtract(int x, String y) {
		int nestedParenCount = 0;
		String nexChar = "";
		String doubleNexChar = "";
		String newNum = "";
		int multiplyParen;
		for (int k = x + 1; k < y.length(); k++) {
			if (k == y.length() - 3) {
				nexChar = "" + y.charAt(k+1);
				doubleNexChar = "";
			} else if (k <= y.length() - 4) {
				nexChar = "" +y.charAt(k+1);
				doubleNexChar = "" + y.charAt(k+2);
			} else {
				nexChar = "";
				doubleNexChar = "";
			}
				
			
			if (y.charAt(k) == '(') {
				nestedParenCount++;
			} else if (nestedParenCount != 0 && y.charAt(k) == ')') {
				nestedParenCount--;				
			} else if (nestedParenCount == 0 && y.charAt(k) == ')') {
				String parenForm = y.substring(x+1, k);
				String toRemove = y.substring(x,k+1);
					if (nexChar != "" && Character.isDigit(nexChar.charAt(0))) {
						newNum+= nexChar;
						toRemove = y.substring(x,k+2);
						if (doubleNexChar != "" && Character.isDigit(doubleNexChar.charAt(0))) {
							newNum+= doubleNexChar;
							toRemove = y.substring(x,k+3);
						}
						multiplyParen = Integer.valueOf(newNum);
						parenForm = addOnes(parenForm);
						parenForm = multiplyInParen(multiplyParen,parenForm);
					}
				y = StringUtils.remove(y, toRemove);
				y += parenForm;
				break;
			}
		
		}
		return y;
	}
	
	public static String addOnes(String y) {
		String nexChar = "";
		String doubleNexChar = "";
		int newNumber = 1;
		for (int m = 0; m < y.length();m++) {
			if (m == y.length() - 2) {
				nexChar = "" + y.charAt(m+1);
				doubleNexChar = "";
			} else if (m <= y.length() - 3) {
				nexChar = "" +y.charAt(m+1);
				doubleNexChar = "" + y.charAt(m+2);
			} else {
				nexChar = "";
				doubleNexChar = "";
			}
			
			if (Character.isUpperCase(y.charAt(m))&& Character.isDigit(nexChar.charAt(0)) ) {
				m++;
			} else if (Character.isUpperCase(y.charAt(m))&& Character.isLowerCase(nexChar.charAt(0)) && Character.isDigit(doubleNexChar.charAt(0))) {
				m+=2;
			} else if (Character.isUpperCase(y.charAt(m))&& Character.isLowerCase(nexChar.charAt(0)) && ((m + 2 == y.length()) || Character.isUpperCase(doubleNexChar.charAt(0)))) {
				y = y.substring(0, m + 1) + newNumber + y.substring(m+2);
				m+=2;
			} else if (Character.isUpperCase(y.charAt(m))) {
				y = y.substring(0, m+1) + newNumber + y.substring(m+1);
				m++;
			}
		}
		
		return y;
	}
	
	public static String multiplyInParen(int x, String y) {
		int newNumber;
		int openParenCount = 0;
		for (int l = 0; l < y.length();l++) {
			if (y.charAt(l) == '(') {
				openParenCount++;				
			} else if (y.charAt(l) == ')') {
				openParenCount--;
			} else {
				if (openParenCount == 0 && Character.isUpperCase(y.charAt(l)) && (Character.isLowerCase(y.charAt(l+1)))) ;
				if (openParenCount == 0 && Character.isDigit(y.charAt(l))) {
					if (l < y.length() - 1 && Character.isDigit(y.charAt(l+1))) {
						newNumber = Character.getNumericValue(y.charAt(l)) * 10 + Character.getNumericValue(y.charAt(l+1));						
					}
					newNumber = x * Character.getNumericValue(y.charAt(l));
					y = y.substring(0, l) + newNumber + y.substring(l+1);
					if (newNumber >= 10) {
						l++;
					} 
					if (newNumber >= 100) {
						l++;
					}
				}
			}
		}
		return y;
	}	

}
