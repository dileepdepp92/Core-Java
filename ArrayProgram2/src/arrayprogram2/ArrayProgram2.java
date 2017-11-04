/**
 * @author Dileep
 **/

package arrayprogram2;
import javax.swing.JOptionPane;

public class ArrayProgram2 {

    public static void main(String[] args) {
        
        int scores[]=new int[args.length];
        for(int a=0;a<args.length;a++)
        {
            scores[a] = Integer.parseInt(args[a]);
        }
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
