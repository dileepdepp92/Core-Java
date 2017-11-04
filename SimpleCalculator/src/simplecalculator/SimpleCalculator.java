/**
 * @author Dileep
 **/
package simplecalculator;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SimpleCalculator {

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,###,###.##");
        System.out.println("simple calculator");
        System.out.println("enter a number");
        double number1 = scan.nextDouble();
        System.out.println("enter another number ");
        double number2 = scan.nextDouble();
        System.out.println("math operators: \n1 Addition \n2 Subtraction \n3 multiplication \n4division");
        System.out.println("enter your choice: ");
        int operator =scan.nextInt();
        if (number2 ==0 && operator ==4)
        {
            System.out.println("you cannot divide by 0 ");
        }
        else
        {
        System.out.println("result: "+formatter.format(calculate(number1,number2,operator)));            
        }        
    }
    public static double calculate(double number1, double number2, int operator) {
        double result =0;
        if(operator ==1)
        {
            result = number1+number2;           
        }
        else if(operator ==2)
        {
            result = number1-number2;           
        }
        else if(operator ==3)
        {
            result = number1*number2;           
        }
        else if(operator ==4)
        {
            result = number1/number2;           
        }
        else 
        {
            System.out.println("invalid");
        }
        return result;
    }
}
