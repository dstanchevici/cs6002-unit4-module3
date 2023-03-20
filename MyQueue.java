// Unit 4, Module 3, ex. 3.24

class QueueItem {
    Coords coords;
    QueueItem next;
}

public class MyQueue {

    QueueItem front, rear;
    int numItems = 0;

    public void add (Coords c)
    {
	if (front == null) {
	    front = new QueueItem ();
	    front.coords = c;
	    rear = front;
	    //rear.next = null; // Is it necessary?
	}
	else {
	    QueueItem nextOne = new QueueItem ();
	    nextOne.coords = c;
	    rear.next = nextOne;
	    rear = nextOne;
	}

	numItems ++;
    } // end-add()

    
    public Coords removeFirst ()
    {
	if (front == null) {
	    System.out.println ("ERROR in MyQueue.removeFirst(): queue is empty");
	    return null;
	}

	Coords c = front.coords;
	front = front.next;
	numItems --;

	return c;
    } // end-removeFirst()


    public boolean isEmpty ()
    {
	return numItems <= 0;	
    }


    public int size ()
    {
	return numItems;
    }

    
    public Coords get (int k)
    {
	if (k >= numItems) {
	    System.out.println ("ERROR in MyQueue.get(): " + k + " is not a valid index for a queue of size " + numItems);
	    return null;
	}
		
	if (k==numItems-1) return rear.coords;
	
	QueueItem ptr = front;
	int counter = 0;
	while (counter < k) {
	    ptr = ptr.next;
	    counter++;
	}

	return ptr.coords;
    } // end-get() 
}
