// Unit 4, module 3, ex. 3.13

public class OurImprovedStackExample {

    public static void main (String[] argv)
    {
	OurImprovedStack stack = new OurImprovedStack ();
	stack.push ('a');
	stack.push ('b');

	System.out.println (stack.pop());
	System.out.println (stack.pop());
	System.out.println (stack.pop());
    }

}
