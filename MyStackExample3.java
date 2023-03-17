// Unit 4, Module 3, ex. 3.3

import java.util.*;

public class MyStackExample3 {

    public static void main (String[] argv)
    {
	Stack<Character> word = new Stack<> ();
	word.push ('s');
	word.push ('t');
	word.push ('a');
	word.push ('c');
	word.push ('k');

	printReverse (word);
    }

    static void printReverse (Stack<Character> s)
    {
	while ( ! s.isEmpty() ) {
	    System.out.println (s.pop());
	}
    }

}
