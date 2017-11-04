package macdonald;

/**
 * @author Dileep
 * this program is going to write the old MacDonald song by using a method
 **/
public class MacDonald {

   
    public static void main(String[] args) {
        animalVerse("pig", "oink");
        animalVerse("cow", "moo");
        animalVerse("sheep", "baa");
       
    }
    public static void animalVerse(String animal, String sound) 
   {
    
       System.out.println("Old MACDONALD had a farm, E-I-E-I-O " + 
            "\nAnd on his farm he had a " + animal + " ,E-I-E-I-O" 
            + "\nWith a " +sound + " "+ sound+ "here and a "
            + sound + " " +sound + "there. "
            + "\nhere a "+ sound +"there a "+sound
            +" everywhere a "+sound +" "+ sound
            +"\nOld MACDONALD had a farm, E-I-E-I-O \n");
         
   }
    
}
