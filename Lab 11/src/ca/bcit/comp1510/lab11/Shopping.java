/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * <p>
 * Shopping.
 * 
 * Tests the item and the transaction class, by representing a shopping cart.
 * </p>
 * 
 * @author Benedict Halim
 * @version 1.0
 * 
 */
public class Shopping {
    
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        boolean buying = true;
        boolean firstBuy = true;
        Item item;
        Transaction transaction = new Transaction(1);
        Scanner scan = new Scanner(System.in);
        while (buying) {
            
            System.out.println("Enter your item name:");
            String name = scan.nextLine();
            
            System.out.println("Enter your item price: ");
            double price = scan.nextDouble();
            
            System.out.println("Enter your item quantity: ");
            int quantity = scan.nextInt();
            
            if (firstBuy) {
                transaction.addToCart(name, price, quantity);
                firstBuy = false;
            } else {
                item = new Item(name, price, quantity);
                transaction.addToCart(item);
            }
            
            System.out.println(transaction + "\n");
            System.out.println("Would you like to buy another item? (Y/N)");
            
            scan.nextLine();
            String userDecision = scan.nextLine();
            
            if (!userDecision.equalsIgnoreCase("Y")
                    && !userDecision.equalsIgnoreCase("N")) {
                System.out.println("Enter Y or N!");
            } else if (userDecision.equalsIgnoreCase("n")) {
                buying = false;
            } else if (userDecision.equalsIgnoreCase("y")) {
                buying = true;
            }
        }
        scan.close();
    }
    
}