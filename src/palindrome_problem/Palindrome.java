package palindrome_problem;

public class Palindrome {
	
	/* A palindrome is a word, sentence or other type of character sequence which reads the same 
	 * backward as forward. For example, "Kayak" and "Anna" are palindromes. "Table" and "James" aren't 
	 * palindromes, because they don't read the same from left to right and from right to left. 
	 * 
	 * The problem can be stated along the following lines: given a string, return true if the string is 
	 * a palindrome and false if it isn't. Include spaces and punctuation in deciding if the string is a palindrome. 
	 * */

	
	static boolean isPalindromeString(String str) {
		String reverse = reverse(str).toLowerCase();
		if (str.toLowerCase().equals(reverse)) 
			return true;
		else
			return false;
	}
	
	static String reverse(String input) {
		if (input == null || input.isEmpty())
			return input;
		else
			return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindromeString("anna"));
		System.out.println(isPalindromeString("Kayak"));
		System.out.println(isPalindromeString("James"));
		System.out.println(isPalindromeString("Table"));
	}

}
