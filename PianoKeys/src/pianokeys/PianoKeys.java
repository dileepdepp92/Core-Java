/**
 * @author Dileep
 **/
package pianokeys;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class PianoKeys extends JComponent {
    
    JFrame frame = new JFrame ("Piano");
    Container content = frame.getContentPane();

    public static void main(String[] args) {
        PianoKeys drawing = new PianoKeys();
        drawing.setUp();   
    }
    public void setUp()
    {
        content.setBackground(Color.white);
        content.add(this);
        frame.setSize(300,110);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
     public void paintComponent (Graphics g)
    {
        for (int i=0; i<5; i++)
        {
            g.drawRect(i*20,0,20,60);
            if (i!=0 && i!=7 && i!=10)
            {
                g.fillRect(i*20 - 5, 0, 10, 30);
            }
        }
    }
}
