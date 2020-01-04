package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
 * BaseConvert.
 * 
 * Demonstrates the use of modulus and division operators to convert a base 10
 * number to a base (2-9) number
 *
 * @author BCIT
 * @version 5.0
 */
public class BaseConvert {
    /**
     * Drives the program.
     * 
     * @param args arguments
     */
    public static void main(String[] args) {
        int base10number; // the number in base 10
        int base; // the new base
        int maximumNumber = 0; // the maximum number that will fit
        // in 4 digits in the new base
        int place0; // digit in the 1's (base^0) place
        int place1;
        int place2;
        int place3;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();
        maximumNumber = (int) Math.pow(base, 4) - 1;
        System.out.println("The max base 10 number to convert for that base is "
                + maximumNumber);
        System.out.print("Please enter a base 10 number to convert: ");
        base10number = scan.nextInt();
        
        place0 = base10number % base;
        base10number = base10number / base;
        
        place1 = base10number % base;
        base10number = base10number / base;
        
        place2 = base10number % base;
        base10number = base10number / base;
        
        place3 = base10number % base;
        base10number = base10number / base;
        
        String baseBNumber = new String("" + place3 + place2 + place1 + place0);
        System.out.println("Your number converted to base " + base + " is: "
                + baseBNumber);
        scan.close();
    }
}
