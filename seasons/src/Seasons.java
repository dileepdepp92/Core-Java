/**
 * @author Dileep
 **/

import javax.swing.*;

public class Seasons 
{

    public static void main(String[] args) 
    {
        int inputTemp;
        String response= JOptionPane.showInputDialog(null, " Enter the temperature", "Probable season", 1);
        inputTemp = Integer.parseInt(response);
        String message = "Based on the temperature of "+ inputTemp 
                +" it is most likely " + determineSeason(inputTemp);
        JOptionPane.showMessageDialog(null,message);
        
    }
    public static String determineSeason (double inputTemp)
    {
        String winter = "Winter";
        if (inputTemp >130 || inputTemp<=-20)
          return "invalid";
        else if (inputTemp >=90)
            return "summer";
        else if (inputTemp>=70)
            return "spring";
        else if (inputTemp>=50)
            return "fall";
        else if (inputTemp<50)
            return winter;
        else 
            return "null";      
        
    }
    
}
