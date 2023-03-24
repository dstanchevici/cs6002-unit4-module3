// Unit 4, Module 3, ex. 3.25

public class MyArrayQueue {

    Coords[] coords = new Coords [100];

    int numItems = 0;

    public void add (Coords c)
    {
	if (numItems < coords.length) {
	    coords[numItems] = c;
	    numItems++;
	}
	else {
	    System.out.println ("ERROR: MyArrayQueue.add(): queue overflow");
	    return;
	}
    }

    public Coords removeFirst ()
    {
	if (numItems == 0) {
	    System.out.println ("ERROR in MyArrayQueue.removeFirst(): queue is empty");
	    return null;
	}

	Coords c = coords[0];
	// Shift left
	for (int i=1; i<numItems; i++) {
	    coords[i-1] = coords[i];
	}
	numItems--;
	return c;
    }

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
	if ( (k < 0) || (k >= numItems) ) {
	    System.out.println ("ERROR in MyArrayQueue.get(): " + k + " is an inappropriate index for a queue with " + numItems + " items.");
	}
	return coords[k];
    }
}
