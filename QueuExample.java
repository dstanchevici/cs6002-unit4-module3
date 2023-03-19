// Unit 4, Module 3, Ex. 3.17

import java.util.*;

public class QueuExample {

    public static void main (String[] argv)
    {
	LinkedList<String> taskQueue = new LinkedList<> ();

	taskQueue.add ("Check email");
	taskQueue.add ("Grade papers");
	taskQueue.add ("Work on CS 6002");
	taskQueue.add ("Make dinner");
	taskQueue.add ("Watch movie");
	
	System.out.println ("********");
	System.out.print ("All tasks:");
	printQueue (taskQueue);

       
	while ( !taskQueue.isEmpty() ) {
	    System.out.println ("------");
	    System.out.println ("Task done: " + taskQueue.removeFirst());
	    System.out.print ("Remaining tasks:");
	    printQueue (taskQueue);
	}

	System.out.println ("********");
	System.out.println ("-> Tasks remaining: " + taskQueue.size());
	
    }

    static void printQueue (LinkedList<String> queue)
    {
	for (int i=0; i<queue.size(); i++) {
	    if (i < queue.size() - 1) {
		System.out.print (" " + queue.get(i) + ",");
	    }
	    else {
		System.out.print (" " + queue.get(i));
	    }
	}
	System.out.println ();	
    }
}
