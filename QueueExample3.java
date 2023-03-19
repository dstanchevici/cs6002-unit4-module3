
public class QueueExample3 {

    public static void main (String[] argv)
    {
        OurQueueWithArray taskQueue = new OurQueueWithArray ();

        // Add some strings.
        taskQueue.add ("Pay bills");
        taskQueue.add ("Clean room");
        taskQueue.add ("Do homework");
        taskQueue.add ("See movie");
        taskQueue.add ("Hang out");
        	  
        System.out.println (taskQueue.remove());
	System.out.println (taskQueue.remove());
	
	System.out.println ("=> Tasks remaining: " + taskQueue.size());
	//System.out.println ("Empty=" + taskQueue.isEmpty());
	
    }

}
