// Unit 4, module 3, ex. 3.12

public class OurStackExample {

    public static void main (String[] argv)
    {
	OurStack stack = new OurStack ();
	stack.push ('a');
	stack.push ('b');
	stack.push ('c');

	System.out.println (stack.pop());
	System.out.println (stack.pop());
	System.out.println (stack.pop());
	System.out.println (stack.pop());
		
    }

}
