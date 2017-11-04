/**
 * @author Dileep
**/
package average;
import javax.swing.JOptionPane;

public class Average {

    public static void main(String[] args) {
            double number = 0 ;
            double sum =   0;
            int times =  0;
            do  
            {
                String input = JOptionPane.showInputDialog(null, "Enter a number to sum ( enter 0 to stop ) : " ) ;
                number = Double.parseDouble( input ) ;
                sum += number ;
                if(number  != 0 ) 
                {
                     times++ ;
                }
            } 
            while (number != 0 ) ;
            System.out.println( "The sum is  " + sum + "\nThe average is " + sum / times ) ;

    }  
    }
    
