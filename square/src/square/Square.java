/**
 * @author Dileep
 **/
package square;

import javax.swing.JOptionPane;

public class Square 
{
  
    public static void main(String[] args) 
    {
        
        String x = JOptionPane.showInputDialog("Length of one side of the square is : ");
        double d;
        d = Double.parseDouble(x);  
        double a,p;
        a = calculateArea(d);
        p = calculatePerimeter(d);
        JOptionPane.showMessageDialog(null," The area is  " +a
                    +" \n The perimeter is " +p);
        
    }
    public static double calculateArea (double d)
    {
        double area = d *d;
        return area;
    }
    public static double calculatePerimeter (double d)
    {
        double perimeter = d *4;
        return perimeter;
    }
    
    
}
