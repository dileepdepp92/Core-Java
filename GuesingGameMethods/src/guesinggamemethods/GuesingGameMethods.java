/**
 * @author Dileep
 **/

package guesinggamemethods;
import javax.swing.JOptionPane;

public class GuesingGameMethods {

    public static void main(String[] args) {
        
        String response =null;
        int computerNumber = (int) (Math.random()*100 + 1);
        int count =1;
       
        while (true)
        {
          response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
          int userAnswer = Integer.parseInt(response); 
        
          if (userAnswer<=1 || userAnswer>100)
          {
          JOptionPane.showMessageDialog(null,invalidGuess(userAnswer));
          count++;
          }else if (userAnswer == computerNumber){
          JOptionPane.showMessageDialog(null,correctGuess(userAnswer, computerNumber)+"\nThe number of guess : "+count);
          break;
          }else {
          JOptionPane.showMessageDialog(null,incorrectGuess(userAnswer, computerNumber)+"\nThe number of guess : "+count);
          count++;
          }
        }
    }
        public static String invalidGuess(int userAnswer)
        {
            String message="Invalid guess";          
            return message;
        }
        public static String correctGuess(int userAnswer, int computerNumber)
        {
            String message ="Your guess is correct ";            
            return message;
        }
        public static String incorrectGuess(int userAnswer, int computerNumber)
        {
            String message = null;
            if (userAnswer > computerNumber)
            {
                message = "Guess lower ";
            }
            else if (userAnswer<computerNumber)
            {
                message = "Guess higher ";
            }   
            return message;
        }   
}