// Unit 4, module 3, ex. 3.14

public class OurImprovedStack2 {

    char[] letters = new char [100];

    // Unlike in OurImprovedStack, here
    // the variable top points to the element at the top of the stack.
    
    int top = -1;

    
    public void push (char ch)
    {
	top ++;
	
	// Test for full stack.
	if (top >= letters.length) {
	    System.out.println ("ERROR: OurStack.push(): stack overflow");
	    return;
	}
	letters[top] = ch;
    }


    public char pop ()
    {
	// Test for empty stack
	if (top < 0) {
	    System.out.println ("ERROR in OurStack.pop(): stack empty");
	    return '@'; // Needs a return statement, so junk letter is returned.
	}
	
	char poppedLetter = letters[top];
	top--;
	return poppedLetter;
    }


    public boolean isEmpty ()
    {
	if (top < 0) {
	    return true;
	}
	else {
	    return false;
	}
    }
}
