/**
 * 
 */
package ca.bcit.comp1510.lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Distance.
 * 
 * Demonstrates the use of various methods in the API for the Math and
 * DecimalFormatter classes.
 *
 * @author Benedict Halim
 * @version 2019 v2.0
 */
public class Distance {
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an x and y value "
                + "for the first point, separated by a space.");
        double x1 = myScanner.nextDouble();
        double y1 = myScanner.nextDouble();
        System.out.println("Enter an x and y value "
                + "for the second point, separated by a space.");
        double x2 = myScanner.nextDouble();
        double y2 = myScanner.nextDouble();
        
        double result = Math
                .sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out
                .println("The distance between these two points is: " + result);
        
        // Q7. Yes, it works for all 4 quadrants.
        
        DecimalFormat decimalFormatter = new DecimalFormat("#.##");
        
        // Q8. i. If the result is very small, it prints only a 0.
        
        String formattedResult = decimalFormatter.format(result);
        System.out.println("The formatted distance is: " + formattedResult);
        
        myScanner.close();
    }
    
}
