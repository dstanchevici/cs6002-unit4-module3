
// Ex: Think through how one could use the stack directly,
// instead of first removing non-letters. Why is it difficult?

import java.util.*;

public class Palindrome2 {

    public static void main (String[] argv)
    {
	// Oldest known recorded palindrome.
        String str = "Evil did I dwell; lewd I did live";
        System.out.println ( str + " " + checkPalindrome(str) );

	// Oldest reference.
        str = "Madam, I'm Adam";
        System.out.println ( str + " " + checkPalindrome(str) );

	// One of the most famous.
        str = "A man, a plan, a canal: Panama";
        System.out.println ( str + " " + checkPalindrome(str) );

	// Not a palindrome, but a palingram:
        str = "He was, was he?";
        System.out.println ( str + " " + checkPalindrome(str) );
    }
    

    static String checkPalindrome (String str)
    {
	char[] characters = str.toCharArray ();
	
	// Create a letters array and populate it with only
	// letters (not punctuation or blanks) from characters.
	// Also, convert letters to lower case.
	int numLetters = 0;
	for (int i=0; i<characters.length; i++) {
	    if ( Character.isLetter (characters[i]) ) numLetters++;
	}

	char[] letters = new char [numLetters];
	int lettersInd = 0;
	for (int i=0; i<characters.length; i++) {
	    if ( Character.isLetter (characters[i]) ) {
		letters[lettersInd++] = Character.toLowerCase(characters[i]);
	    }
	}

	// Push first half of letters onto the stack.
	int mid = letters.length / 2;
	Stack<Character> stack = new Stack<> ();
	for (int i=0; i<mid; i++) {
	    stack.push (letters[i]);
	}

	// If odd, increase mid by one to ignore the middle letter.
	if (numLetters % 2 > 0) mid++;

	// Check second half.
	for (int i=mid; i<letters.length; i++) {
	    char ch = stack.pop();
	    if (ch != letters[i]) {
		return "is not a palindrome";
	    }
	}

	return "is a palindrome";
    }

}
