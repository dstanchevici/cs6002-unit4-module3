
import java.util.*;

public class OurStack2 {

    ArrayList<Character> array = new ArrayList<Character>();
    int top = 0; 

    public void push (char ch)
    {
	array.add (ch);
	top ++;
    }

    public char pop ()
    {
	if (top <= 0) {
	    System.out.println ("ERROR in OurStack2.pop(): stack empty");
	    return '@';
	}
	
	top --;
	return array.remove (top);
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
