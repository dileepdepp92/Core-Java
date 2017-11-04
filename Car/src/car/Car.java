/**
 * @author Dileep
 **/
package car;
import java.awt.*;
import javax.swing.*;

public class Car extends JComponent{
    JFrame frame = new JFrame (" car") ;
    Container content = frame . getContentPane () ;

    public static void main(String[] args) {
        
        Car drawing = new Car () ;
        drawing . setUp () ;
    }
    public void setUp()
    {
        content.setBackground(Color.CYAN);
        content.add(this);
        
        frame.setSize(475,325);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void paintComponent (Graphics g ) {
        g. setColor (Color . RED) ; 
        g. drawLine ( 7 , 206 , 7 , 141 );
        g. drawLine (7, 141 , 64 , 88 ) ;
        g. drawLine (64 , 88 , 181 , 88 );
        g. drawLine ( 181 , 88 , 214 , 7 ); 
        g. drawLine (214 , 7 , 335 , 7 );
        g. drawLine (335, 7 , 364 , 89 ) ;
        g. drawLine (364 , 89 , 427 , 89 );
        g. drawLine (427 , 89 , 427 , 159 );
        g. drawLine (427 , 159 , 377 , 206 );
        g. drawLine (377, 206 , 7 , 206 );
        g. drawOval ( 60 , 155 , 100 ,100);
        g. drawOval (300 , 155 , 100 , 100 );
        }

    
}
