// Unit 4, module 3, ex. 3.12, class implementing stack with an array.
// Used by OurStackExample and subsequent clients.

public class OurStack {

    char[] letters = new char [100];

    // letters[top]
    int top = 0;

    
    public void push (char ch)
    {
	letters[top] = ch;
	top ++;
    }


    public char pop ()
    {
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
