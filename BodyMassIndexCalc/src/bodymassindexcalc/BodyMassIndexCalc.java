/**
 * @author Dileep
 * this program will calculate the BMI with a function method 
 */
package bodymassindexcalc;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BodyMassIndexCalc {

    public static void main(String[] args) {
        String response;
        response = JOptionPane.showInputDialog(null, "enter ur height in inches");
        double height =Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null, "enter ur weight in pounds");
        double weight =Double.parseDouble(response); 
        double bmi= calculateBMI(height, weight);
        DecimalFormat pattern = new DecimalFormat ("###.00");
        JOptionPane.showMessageDialog(null, "height : " + height 
                +"\nweight : "+weight 
                +"\nBMI : "+pattern.format(bmi)
                +"\nBMI catogories : "
                +"\nunderweight =<18.5 \nnormal weight =18.5-24.9 \nover weight =25-29.9"
                +"\nobesity =30 or greater ");
    }
public static double calculateBMI(double height, double weight){
    return (weight*703)/(height*height);
}
    
}
