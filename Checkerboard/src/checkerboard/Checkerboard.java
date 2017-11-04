/**
 * @author Dileep
 **/
package checkerboard;

import java.awt.*;
import javax.swing.*;

public class Checkerboard extends JComponent {
    
    JFrame frame = new JFrame ("Cheackerboard");
    Container content = frame.getContentPane();
    
    public static void main(String[] args) 
    {
    Checkerboard drawing = new Checkerboard();
    drawing.setUp();    
    }
    public void setUp()
    {
        content.setBackground(Color.white);
        content.add(this);
        frame.setSize(220,240);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void paintComponent (Graphics g)
    {
        for (int r=0; r<5; r++)
        {
            for (int c=0;c<5;c++)
            {
                int x=c*40;
                int y=r*40;
                if((r+c)%2!=0)
                {
                    g.setColor(Color.blue);
                    g.fillRect(x, y, 40 , 40);
                } else {
                    g.setColor(Color.CYAN);
                    g.fillRect(x, y, 40, 40);
                }
            }
        }
    }
}
