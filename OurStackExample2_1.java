// NOTE:
// This is for ex. 3.15, which requires working with
// OurStackExample2.java.

// I'm using OurStackExample2_1.java b/c
// OurStackExample2.java has already been used for ex. 3.13.

// I have emailed Prof. Simha about this discrepancy.

public class OurStackExample2_1 {

    public static void main (String[] argv)
    {
	OurStack2 stack = new OurStack2 ();
	stack.push ('a');
	stack.push ('b');
	stack.push ('c');

	System.out.println (stack.pop());
	System.out.println (stack.pop());
	System.out.println (stack.pop());

	// From empty stack.
	System.out.println (stack.pop());
    }

}
