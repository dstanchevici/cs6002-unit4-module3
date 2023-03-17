// Unit 4, Module 3, Ex. 3.1

import java.util.*;

public class MyStackExample {

    public static void main (String[] argv)
    {
	Stack<String> toDoList = new Stack<> ();

	toDoList.push ("Pay bills");
	toDoList.push ("Clean room");
	toDoList.push ("Do homework");
	toDoList.push ("See movie");
	toDoList.push ("Hang out");

	System.out.println ("My top three priorties: ");
	String s;
	while ( !toDoList.isEmpty() ) {
	    s = toDoList.pop();
	    System.out.println (" " + s);
	}
    }
}
