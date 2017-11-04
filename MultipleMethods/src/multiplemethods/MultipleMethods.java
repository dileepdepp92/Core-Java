/**
 * @author Dileep
 **/
package multiplemethods;

public class MultipleMethods {

    public static void main(String[] args) {
        MyLibrary.printName();
        MyLibrary.printIt("I love tina");
        double x = MyLibrary.squareIt(30.5);
        MyLibrary.convertToCelsius(x);
        MyLibrary.convertToCelsius(MyLibrary.squareIt(12.0));
    }
    
}
