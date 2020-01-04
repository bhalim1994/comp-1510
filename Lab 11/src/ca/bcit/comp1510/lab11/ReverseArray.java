/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p>
 * ReverseArray.
 * 
 * Reverses an Array of integers inputed by the user.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class ReverseArray {
    /**
     * The array of integers.
     */
    private static int[] intArray;
    
    /**
     * Swaps the array's elements.
     */
    private static void swap() {
        int temp1;
        int temp2;
        
        for (int i = 0; i < intArray.length / 2; i++) {
            temp1 = intArray[i];
            temp2 = intArray[intArray.length - 1 - i];
            intArray[i] = temp2;
            intArray[intArray.length - i - 1] = temp1;
        }
        
    }
    
    /**
     * Reverses the elements of the inputed array.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        
        boolean stop = false;
        
        while (!stop) {
            scan = new Scanner(System.in);
            
            try {
                System.out.println("Enter an integer greater than 0:");
                input = scan.nextInt();
                stop = true;
                
                if (input <= 0) {
                    System.out.println("Input needs to be greater than 0");
                    stop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
            }
            
        }
        
        intArray = new int[input];
        for (int i = 0; i < input; i++) {
            stop = false;
            
            while (!stop) {
                scan = new Scanner(System.in);
                
                try {
                    System.out.println(
                            "Please enter a value for index " + (i) + ":");
                    intArray[i] = scan.nextInt();
                    stop = true;
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input. Enter an integer.");
                }
                
            }
            
        }
        
        System.out.println("\nThe original array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        swap();
        System.out.println("\nThe original array reversed:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        scan.close();
        
    }
    
}