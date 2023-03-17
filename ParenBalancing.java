// Unit 4, module 3, ex. 3.6

import java.util.*;

public class ParenBalancing {

    public static void main (String[] argv)
    {
	String s = "()(())()";
	checkParens (s);

	s = "((())";
	checkParens (s);

	s = ")(";
	checkParens (s);
	
	//s = "())";
	//checkParens (s);
	
    }

    static void checkParens (String inputStr)
    {
	char[] letters = inputStr.toCharArray();

	Stack<Character> stack = new Stack<> ();

	boolean unbalanced = false;

	for (int i=0; i<letters.length; i++) {

	    if (letters[i] == '(') {
		stack.push (letters[i]);
	    }
	    else if (letters[i] == ')') {
		if ( stack.isEmpty() ) {
		    unbalanced = true;
		    break;
		}
		
		char ch = stack.pop ();

		// Why do we need this checker?
		// How can ch  ever be != '(' ?
		if (ch != '(') {
		    unbalanced = true;
		    break;
		}
	    }
	} //end-for

	if ( (unbalanced) || ( ! stack.isEmpty()) ) {
	    System.out.println ("String " + inputStr + " has unbalanced parens.");
	}
	else {
	    System.out.println ("String " + inputStr + " has balanced parens.");
	}
    }

}
