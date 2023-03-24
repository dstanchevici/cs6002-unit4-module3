public interface QueueDataStructure {

    public void add (Coords c);

    public Coords removeFirst ();

    public boolean isEmpty ();

    public int size ();

    public Coords get (int k);
}
