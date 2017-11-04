/**
 * @author Dileep
 **/
package greeting;
import java.util.GregorianCalendar;

public class Greeting {
   
    public static void main(String[] args) {
        GregorianCalendar calander = new GregorianCalendar();
        int hour;
        hour = calander.get(calander.HOUR_OF_DAY);
        System.out.println(determineTimeofDay(hour));
    }
    public static String determineTimeofDay(int hour)
    {
        String message = null;
        if (hour<12)
        {
            message= "good morning ";
        }
        else if (hour < 17)
        {
            message = "good afternoon";
        }
        else
        {
            message ="good evening";
        }
        return message;
    }
    
}
