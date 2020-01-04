package q1;

import java.util.Scanner;

/**
 * <p>
 * Demonstrates the use of the division and modulus operator by taking a
 * monetary input and calculating the change equivalent to the input.
 * </p>
 *
 * @author Benedict Halim, Set 1B
 * @version 1.1
 */
public class Change {
    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        // Constant to convert input into cent format.
        final int centConverter = 100;
        // Bias to aid the conversion loss of significant figures from double to
        // int. For cases such as 33.3, would be missing a cent without this.
        final double bias = 0.001;
        
        // Ten dollars represented in cents.
        final int tenDollar = 1000;
        // Five dollars represented in cents.
        final int fiveDollar = 500;
        // Two dollars represented in cents.
        final int toonies = 200;
        // One dollar represented in cents.
        final int loonies = 100;
        // Quarters represented in cents.
        final int quarter = 25;
        // Dimes represented in cents.
        final int dime = 10;
        // Nickles represented in cents.
        final int nickle = 5;
        // Pennies represented in cents.
        final int penny = 1;
        
        // Prompts, scans, and stores input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the monetary amount "
                + "you'd like to calculate into change:");
        double amount = scan.nextDouble();
        int convertedAmount = (int) ((amount + bias) * centConverter);
        
        System.out.println("Your change is: ");
        
        // Calculate change with ten dollar bills & leftover of inputed amount.
        System.out.println(
                (convertedAmount / tenDollar) + " ten dollar bill(s).");
        convertedAmount %= tenDollar;
        
        // Calculate change with five dollar bills & leftover of inputed amount.
        System.out.println(
                (convertedAmount / fiveDollar) + " five dollar bill(s).");
        convertedAmount %= fiveDollar;
        
        // Calculate change with toonies & leftover of inputed amount.
        System.out.println((convertedAmount / toonies) + " toonie(s).");
        convertedAmount %= toonies;
        
        // Calculate change with loonies & leftover of inputed amount.
        System.out.println((convertedAmount / loonies) + " loonie(s).");
        convertedAmount %= loonies;
        
        // Calculate change with quarters & leftover of inputed amount.
        System.out.println((convertedAmount / quarter) + " quarter(s).");
        convertedAmount %= quarter;
        
        // Calculate change with dimes & leftover of inputed amount.
        System.out.println((convertedAmount / dime) + " dime(s).");
        convertedAmount %= dime;
        
        // Calculate change with nickles & leftover of inputed amount.
        System.out.println((convertedAmount / nickle) + " nickle(s).");
        convertedAmount %= nickle;
        
        // Calculate change with pennies.
        System.out.println((convertedAmount / penny) + " penny/pennies.");
        
        // Close scan object.
        scan.close();
    }
    
};
