/**
 * @author Dileep
 **/
package happysong;

public class HappySong {
   
   public static void main(String[] args) 
   {
    happyVerse("Clap your hands", "clap");
    happyVerse("stomp your feet", "stomp");
    happyVerse("shout Hurray!", "hoo-ray");
   }

   public static void happyVerse(String action, String sound) 
   {
    System.out.println("if you are happy and you know it, " +action +" ("+sound +")");
    
   }
}
