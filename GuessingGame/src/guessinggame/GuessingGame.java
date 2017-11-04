/**
 * @author Dileep
 **/
package guessinggame;
import javax.swing.JOptionPane;

public class GuessingGame {

   
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        System.out.println(computerNumber);
        String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
        int userAnswer = Integer.parseInt(response);
        JOptionPane.showMessageDialog(null,"Your answer is correct : "+computerNumber+"\n"+"The number of guess taken is : "+determineGuess(userAnswer, computerNumber));
    }
    public static int determineGuess(int userAnswer, int computerNumber)
    {
        int count =1;
        while (userAnswer != computerNumber){
            if (userAnswer<=1 || userAnswer>100)
            {
                count++;
                JOptionPane.showMessageDialog(null,"Your guess is invalid ");
                userAnswer = Integer.parseInt(JOptionPane.showInputDialog(null, "enter a guess between 1 and 100"));
            }
            else 
            {
                if (userAnswer > computerNumber){
                count++;
                JOptionPane.showMessageDialog(null,"Too High \nNumber of times guessed is "+ count);
                userAnswer = Integer.parseInt(JOptionPane.showInputDialog(null, "enter a guess between 1 and 100"));
                }
                else if (userAnswer<computerNumber){
                count++;
                JOptionPane.showMessageDialog(null,"Too Low \nNumber of times guessed is "+ count);
                userAnswer = Integer.parseInt(JOptionPane.showInputDialog(null, "enter a guess between 1 and 100"));
                }   
            }
        }
        return count ;
    }
}
