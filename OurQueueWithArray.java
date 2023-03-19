// Unit 4, module 3, ex. 3.18

public class OurQueueWithArray {

    String[] strings = new String [100];

    int topInd = -1, bottomInd = -1;
    
    public void add (String s)
    {
	topInd ++;
	//System.out.println ("topInd=" + topInd + " bottomInd=" + bottomInd);
	if (topInd >= strings.length) {
	    System.out.println ("ERROR: OurQueueWithArray.add(): stack overflow");
	    return;
	}
	
	strings[topInd] = s;
    }


    public String remove ()
    {
	if (topInd<=bottomInd) {
	   return "ERROR in OurQueueWithArray.remove(): queue empty";
	}

	bottomInd ++;
	return strings[bottomInd];
    }


    public boolean isEmpty ()
    {
	if (topInd <= bottomInd) {
	    return true;
	}
	else {
	    return false;
	}
    }


    public int size ()
    {
	return topInd - bottomInd;
    }
}
