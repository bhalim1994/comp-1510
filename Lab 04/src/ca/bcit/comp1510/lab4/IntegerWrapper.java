/**
 * 
 */
package ca.bcit.comp1510.lab4;

import java.util.Scanner;

/**
 * IntegerWrapper.
 * 
 * Demonstrates the use of wrapper classes using integers.
 *
 * @author Benedict Halim
 * @version 2019 v2.0
 */
public class IntegerWrapper {
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        // 3.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        Integer input = Integer.valueOf(scan.nextInt());
        
        String binary = Integer.toBinaryString(input);
        System.out.println("Your entered integer in base 2 is: " + binary);
        
        String octal = Integer.toOctalString(input);
        System.out.println("Your entered integer in base 8 is: " + octal);
        
        String hex = Integer.toHexString(input);
        System.out.println(
                "Your entered integer in base 16 is: " + hex.toUpperCase());
        
        // 4.
        System.out.println("The maximum possible Java integer value is "
                + Integer.MAX_VALUE);
        System.out.println("The minimum possible Java integer value is "
                + Integer.MIN_VALUE);
        
        // 5.
        System.out.println("Please enter your first integer:");
        String num1 = scan.next();
        System.out.println("Please enter your second integer:");
        String num2 = scan.next();
        System.out.println(num1 + " + " + num2 + " = "
                + (Integer.parseInt(num1) + Integer.parseInt(num2)));
        
        scan.close();
    }
    
}
