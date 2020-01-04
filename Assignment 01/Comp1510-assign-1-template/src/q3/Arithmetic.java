package q3;

import java.util.Scanner;

/**
 * <p>
 * Demonstrates the use of the addition, subtraction, multiplication, and
 * division operators by taking two inputed numbers and calculating their sum,
 * difference, product, and quotient.
 * </p>
 *
 * @author Benedict Halim, Set 1B
 * @version 1.0
 */
public class Arithmetic {
    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Prompts, scans, and stores input of two numbers. Used double as it
        // allows for more precision as a 64 bit floating point number.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first floating point number: ");
        double firstNumber = scan.nextDouble();
        System.out.println("Please enter the second floating point number: ");
        double secondNumber = scan.nextDouble();
        
        // Calculate the sum, difference, product, and quotient.
        System.out.println(firstNumber + " + " + secondNumber + " = "
                + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = "
                + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = "
                + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = "
                + (firstNumber / secondNumber));
        
        // Close scan object.
        scan.close();
    }
    
};
