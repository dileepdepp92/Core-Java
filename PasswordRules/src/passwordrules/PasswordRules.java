/**
 * @author Dileep
 **/
package passwordrules;
import javax.swing.JOptionPane;


public class PasswordRules {

    public static void main(String[] args) {

        String pass1 = JOptionPane.showInputDialog(null, "enter a password"
                +"\n must be between 6-12 character long"
                +"\nmust contain a number");
        if (pass1.length()>=6 && pass1.length()<=12)
        {
            if (pass1.contains("1")||pass1.contains("2") 
                    ||pass1.contains("3")||pass1.contains("4")
                    ||pass1.contains("5")||pass1.contains("6")
                    ||pass1.contains("7")||pass1.contains("8")
                    ||pass1.contains("9")||pass1.contains("0"))
                    {
                String pass2 = JOptionPane.showInputDialog(null, "repeat password");
                if (pass1.equals(pass2))
                {
                    JOptionPane.showMessageDialog(null, "successfull");
                }else
                {
                    JOptionPane.showMessageDialog(null, "the password are not equal");                    
                }
            }else
            {
                JOptionPane.showMessageDialog(null, "your password must contain a digit");
            }
        }else{
            JOptionPane.showMessageDialog(null, "your password needs to be between 6-12 character");
       }


    }
    
}
