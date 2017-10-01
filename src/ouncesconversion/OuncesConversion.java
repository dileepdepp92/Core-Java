
package ouncesconversion;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class OuncesConversion {   
    
    public static void main(String[] args) 
    {
    int cup=8;
    int pint=16;
    int quart=32;
    int gallon=128; 
    while (true)
    {
    try
    {
    String x = JOptionPane.showInputDialog("How many ounces do you wish to convert?");
    double d;
    d = Double.parseDouble(x);  
    DecimalFormat df = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null,"Ounces: "+(int)d + "\n Cups: "
            +df.format(d/cup )+ "\n Pints: " 
                    + df.format(d/pint) + "\n Quarts: " 
                             + df.format(d/quart) + "\n Gallon: "
                                    + df.format(d/gallon));
    break;
    }
    catch (Exception e) 
    {
        JOptionPane.showMessageDialog(null,"!Please enter numbers");
    }
    }
    }
}