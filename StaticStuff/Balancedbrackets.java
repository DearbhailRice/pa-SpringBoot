/**
 * 
 */
package uk.ac.belfastmet.StaticStuff;

import java.util.ArrayList;

/**
 * class to check if a inputed string has balanced brackets
 * 
 * @author ric19171870
 *
 */
public class Balancedbrackets {

	/**
	 * method to test if an opening bracket has a corresponding closing bracket and
	 * assert if is balanced or not balanced
	 * 
	 * @param testString
	 * @return String balanced or Not balanced
	 */
	public static String balancedBrackets(String testString) {
		String balanced = "Not Balanced";

		int countOpenParen = 0;
		int countClosedParen = 0;
		int countOpenCurly = 0;
		int countClosedCurly = 0;
		int countOpenSquare = 0;
		int countClosedSquare = 0;

		String parenStr = "";
		String curlyStr = "";
		String squareStr = "";

		StringBuilder paren = new StringBuilder();
		StringBuilder curly = new StringBuilder();
		StringBuilder square = new StringBuilder();

		ArrayList<String> bracketStr = new ArrayList<String>();

		if (evenStringLength(testString)) {
			for (int index = 0; index < testString.length(); index++) {
				// number of ( or { or [ should equal number of ) or } or ]
				switch (testString.charAt(index)) {
				case '(':
					countOpenParen++;
					paren.append(testString.charAt(index));
					break;
				case ')':
					countClosedParen++;
					paren.append(testString.charAt(index));
					break;
				case '{':
					countOpenCurly++;
					curly.append(testString.charAt(index));
					break;
				case '}':
					countClosedCurly++;
					curly.append(testString.charAt(index));
					break;
				case '[':
					countOpenSquare++;
					square.append(testString.charAt(index));
					break;
				case ']':
					countClosedSquare++;
					square.append(testString.charAt(index));
					break;
				}

			}

			parenStr = paren.toString();
			curlyStr = curly.toString();
			squareStr = square.toString();

			bracketStr.add(squareStr);
			bracketStr.add(parenStr);
			bracketStr.add(curlyStr);
			
			
			if ((countOpenParen == countClosedParen) && (countOpenCurly == countClosedCurly)
					&& (countOpenSquare == countClosedSquare) && (!bracketStrStartsWithClose(strNotNull(bracketStr)))) {
				// work through the strings and if closing bracket occurs before corresponding
				// opening bracket return not balanced

				balanced = "Balanced";

			}
			System.out.println(testString + " returns " + balanced);

		} else {
			balanced = "Not Balanced";
		}
		return balanced;
	}

	/**
	 * method to check if a given string starts with a closing bracket
	 * 
	 * @param brackets
	 * @return
	 */
	public static boolean bracketStrStartsWithClose(ArrayList<String> bracketStr) {
		boolean balanced = false;
		int startWithCloseCount = 0;
		// System.out.println(brackets);
		for (int index = 0; index < bracketStr.size(); index++) {
			if (evenStringLength(bracketStr.get(index))) {
				if ((bracketStr.get(index).charAt(0) == '}') || (bracketStr.get(index).charAt(0) == ')')
						|| (bracketStr.get(index).charAt(0) == ']')) {
					startWithCloseCount++;
				}

			}
		}
		if (startWithCloseCount > 0) {
			balanced = true;
		}
		return balanced;
	}

	/**
	 * method to check a string in the brackets array is not null and return and
	 * array only containing not null strings
	 *
	 * @param bracketStr
	 * @return ArrayList <String >
	 */
	public static ArrayList<String> strNotNull(ArrayList<String> bracketStr) {

		for (int index = 0; index < bracketStr.size(); index++) {
			if (bracketStr.get(index).isEmpty()) {
				bracketStr.remove(index);
			}
		}
		System.out.println(bracketStr.toString());
		return bracketStr;

	}

	/**
	 * method to check if a strings length is even and if not returns false
	 */
	public static boolean evenStringLength(String word) {
		boolean even = false;
		if (word.length() % 2 == 0) {
			even = true;
		}
		return even;
	}
	
	/** 
	 * method to determine if all strings in the brackets array is even and returns true 
	 * @param bracketStr
	 * @return
	 */
	public static boolean braketsArrayStringsEvenLength(ArrayList<String> bracketStr) {
		boolean even =false;
		int evenCount=0;
		for (String brackets :bracketStr) {
			if (evenStringLength(brackets)) {
				evenCount++;
			}
		}
		if (evenCount==bracketStr.size()) {
			even=true;
		}
		return even;
	}

}