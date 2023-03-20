
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


class AntEaterPanel extends JPanel {

    // We'll put all the ant-clicks into a queue, from which the anteater 
    // will pull out the next target.
    LinkedList<Coords> antQueue = new LinkedList<Coords>();

    Coords antEater;    // The current position of the anteater.
    Coords nextAnt;     // The position of the current ant being chased.

    public void initialize ()
    {
        antEater = new Coords ();
	antEater.x = 0;
	antEater.y = 0;
    }


    public void makeFrameAndDisplay ()
    {
	JFrame f = new JFrame ();
        f.setTitle ("AntEater");
        f.setSize (600, 600);

        // The frame only consists of the panel.
        f.getContentPane().add (this);

        f.setVisible (true);
    }

} //end-panel



public class AntEater5 {

    public static void main (String[] argv)
    {
        AntEaterPanel p = new AntEaterPanel ();
	p.initialize ();
	p.makeFrameAndDisplay ();
    }

}
