/**
 * @author Dileep
 **/

package arrayprogram3;
import javax.swing.JOptionPane;

public class ArrayProgram3 {

    public static void main(String[] args) {
        int gradeA=0;
        int gradeB=0;
        int gradeC=0;
        int gradeD=0;
        int gradeF=0;
        String response = JOptionPane.showInputDialog(null, "Enter number of scores: ");
        int number = Integer.parseInt(response);
        int scores[]=new int[number];
        for(int a=0;a<number;a++)
        {
            response = JOptionPane.showInputDialog(null, "Enter score " +(a+1) );
            scores[a] = Integer.parseInt(response);
            int grade = Integer.parseInt(response);
            if (grade >= 90 && grade <=100)
            {
                ++gradeA;
            }
            else if (grade >=80 && grade <=89)
            {
                ++gradeB;
            }
            else if (grade >=70 && grade <=79)
            {
                ++gradeC;
            }
            else if (grade >=60 && grade <=69)
            {
                ++gradeD;
            }
            else if (grade < 60 )
            {
                ++gradeF;
            }
        }
        int sum =0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i =0;i<scores.length;i++)
        {
        sum = sum +scores[i];
        if (scores[i]>largest)
        {
            largest = scores[i];    
        }
        if (scores[i]<smallest)
        {
            smallest = scores[i];    
        }
        }
        JOptionPane.showMessageDialog(null," The sum is " +sum
        +"\n The average is "+sum/scores.length
        +"\n The largest number is " +largest 
        +"\n The smallest number is " +smallest
        +"\n The number of students with scores of 90-100 (A) is " +gradeA
        +"\n The number of students with scores of 80-89  (B) is " +gradeB
        +"\n The number of students with scores of 70-79  (C) is " +gradeC
        +"\n The number of students with scores of 60-69  (D) is " +gradeD
        +"\n The number of students with scores below 60  (F) is " +gradeF);
    }
}
