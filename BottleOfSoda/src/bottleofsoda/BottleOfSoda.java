/**
 * this program will write the "99 bottles of soda" song
 * @author Dileep
 **/

package bottleofsoda;

public class BottleOfSoda {

public static void main(String[] args) 
{
    for  (int  x  = 99; x > 0 ; x -- )   
    {
            printBottlesVerse (x) ;
    }
        System.out.println ("Go to the store and buy some more ," + "\n99 bottles of soda on the wall . \n " );
}

public static void printBottlesVerse ( int numberOfBottles )   
    {
    System.out.println (numberOfBottles
                        +  "  bottles of soda on the wall ,   "
                        + " numberOfBottles + “ of bottles of soda. "
                        + "\nTake one down and pass it around,    "
                        + (numberOfBottles -1 )
                        + "  of bottles of soda on the wall . \n" ) ;
    }
}

