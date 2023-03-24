// Unit 4, module 3, ex. 3.30

// The implementation is copied from OurStack.java

public class StackImpl1 implements OurStackInterface {

    char[] letters = new char [100];

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
