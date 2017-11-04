/**
 * @author Dileep
 * JDK 8 updates 144
 **/

package arrayprogram1;
import javax.swing.JOptionPane;

public class ArrayProgram1 {

    public static void main(String[] args) {
        
        int scores[]={81,92,34,89,56};
        int sum =0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i =0;i<scores.length;i++)
        {
        sum =sum +scores[i];
        if (scores[i]>largest)
        {
            largest = scores[i];    
        }
        if (scores[i]<smallest)
        {
            smallest = scores[i];    
        }
        }
        JOptionPane.showMessageDialog(null,"the sum is " +sum
        +"\nthe average is "+sum/scores.length
        +"\nthe largest number is " +largest 
        +"\n the smallest number is " +smallest);
    }
}
