package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
 * Paint.
 * 
 * Demonstrates the use of the scanner method to calculate the surface area of a
 * box (minus the bottom)
 * 
 * @author Benedict Halim
 * @version 2019 v5.0
 */
public class Paint {
    static final int COVERAGE = 400;
    
    /**
     * Drives the program.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        double length = myScanner.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double width = myScanner.nextDouble();
        System.out.println("What is the height of the room in feet?");
        double height = myScanner.nextDouble();
        System.out.println("What is the number of coats needed?");
        int coats = myScanner.nextInt();
        
        double surfaceArea = (length * width) + (2 * length * height)
                + (2 * width * height);
        double coverageNeeded = surfaceArea * coats;
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        System.out.println("The cans of paint you need to buy is "
                + (int) Math.ceil(cansOfPaintNeeded) + "cans.");
        myScanner.close();
    }
    
}
