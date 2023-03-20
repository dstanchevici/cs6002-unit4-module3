
import java.util.*;

public class AntEater2 {

    // A queue of ants to hunt down.
    static LinkedList<Coords> antQueue = new LinkedList<Coords>();

    static Coords antEater;    // The current position of the anteater.
    static Coords nextAnt;     // The position of the current ant being chased.

    public static void main (String[] argv)
    {
        // This is where we'll start the anteater.
        antEater = new Coords ();
	antEater.x = 0;
	antEater.y = 0;
	
	makeAntLocations (5);
	nextAnt = antQueue.removeFirst();
	while (nextAnt != null) {
	    huntNextAnt ();
	}
    }

    static void makeAntLocations (int numAnts)
    {
	for (int i=0; i<numAnts; i++) {
	    Coords c = new Coords ();
	    c.x = random (0,100);
	    c.y = random (0,100);
	    System.out.printf ("Ant located at: x=%6.1f y=%6.1f \n", c.x, c.y);
	    antQueue.add (c);
	}
    }

    static void huntNextAnt ()
    {
	// Check distance to current ant.
	if ( distance(nextAnt, antEater) < 10 ) {
	    // Eat the ant if the anteater is close enough.
	    System.out.printf ("Anteater: ate ant at x=%6.1f y=%6.1f \n", nextAnt.x, nextAnt.y);
	    if (! antQueue.isEmpty()) {
		nextAnt = antQueue.removeFirst();
	    }
	    else {
		nextAnt = null;
	    }
	}
	else {
	    // Otherwise, step towards ant. This is the "trig math"
	    // to find the direction and step in that direction.
	    double theta = Math.atan2 ((nextAnt.y - antEater.y), (nextAnt.x - antEater.x));
	    double stepsize = 10.0;
	    antEater.x = antEater.x + stepsize*Math.cos(theta);
	    antEater.y = antEater.y + stepsize*Math.sin(theta);
	    System.out.printf ("Anteater: moved to x=%6.1f y=%6.1f \n", antEater.x, antEater.y);
        }
    }

    static double random (double x, double y)
    {
	Random rand = new Random ();
	double z = (y-x) * rand.nextDouble();
	return x + z;
    }

    static double distance (Coords p, Coords q)
    {
        double distSq = (p.x-q.x)*(p.x-q.x) + (p.y-q.y)*(p.y-q.y);
        return Math.sqrt (distSq);
    }

}
