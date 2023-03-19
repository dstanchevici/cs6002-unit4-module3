// Unit 4, module 3, ex. 3.12, class implementing stack with an array.
// Used by OurStackExample and subsequent clients.

public class OurImprovedStack {

    char[] letters = new char [100];

    // The variable top points to the next available spot in the array.
    // Thus, letters[top] is the value that has just been pushed
    // or that is about to be popped.
    int top = 0;

    
    public void push (char ch)
    {
	// Test for full stack.
	if (top >= letters.length) {
	    System.out.println ("ERROR: OurStack.push(): stack overflow");
	    return;
	}
	letters[top] = ch;
	top ++;
    }


    public char pop ()
    {
	// Test for empty stack
	if (top <= 0) {
	    System.out.println ("ERROR in OurStack.pop(): stack empty");
	    return '@'; // Needs a return statement, so junk letter is returned.
	}
	
	top--;
	return letters[top];
    }


    public boolean isEmpty ()
    {
	if (top == 0) {
	    return true;
	}
	else {
	    return false;
	}
    }
}
