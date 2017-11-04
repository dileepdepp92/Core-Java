/**
 * @author Dileep
 **/

package guessinggameadvanced;
import javax.swing.JOptionPane;

public class GuessingGameAdvanced {

    public static void main(String[] args) {
        String response = null;
        int count = 0;       
        int computerNumber;
        computerNumber = (int) (Math.random()*100 + 1);
        while (true)
        {
            response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
            int userAnswer = Integer.parseInt(response); 
            if (userAnswer<=1 || userAnswer>100)
            {
                JOptionPane.showMessageDialog(null," The guess is invalid ");
            }
            else if (userAnswer == computerNumber)
            {
                JOptionPane.showMessageDialog(null,"Your answer is correct : "
                    +computerNumber + "\nYou found the answer in "+count +" guesses");
                break;
            }
            else 
            {
                if (userAnswer > computerNumber)
                {
                count++;
                JOptionPane.showMessageDialog(null,"Too High \nNumber of times guessed "+ count);
                }
                else if (userAnswer<computerNumber)
                {
                count++;
                JOptionPane.showMessageDialog(null,"Too Low \nNumber of times guessed "+ count);
                }   
            }
        }
    }
}
