/**
 * @author Dileep
 **/
package multiplemethods;

import javax.swing.JOptionPane;


public class MyLibrary {
    public static void printName() {
        System.out.println("my name is Dileep ");
        
    }
    public static void printIt(String message) {
        System.out.println(message);
     }     
    public static void convertToCelsius(double fah){
        double cel = 5.0/9.0*(fah-32);
        JOptionPane.showMessageDialog(null,"the farenheit temperature is "+fah
                +"\n the corresponding celcius temp is " +cel);
       
    }
    public static double squareIt(double num) {
        return num*num;        
    }
}
