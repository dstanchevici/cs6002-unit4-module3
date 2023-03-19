// This is for ex. 3.15, which requires working with
// OurStackExample2.java.


public class OurStackExample2 {

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
