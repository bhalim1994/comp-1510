/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Item.
 * 
 * Creates an Item object.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Item {
    /**
     * Name of item.
     */
    private final String name;
    /**
     * Price of item.
     */
    private final double price;
    /**
     * Quantity of item.
     */
    private final int quantity;
    
    /**
     * Constructor for an Item object by defining its name, price and quantity.
     * 
     * @param n a String for the name of the item
     * @param p a double for the price of the item
     * @param q an integer for the quantity of the item
     */
    public Item(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }
    
    /**
     * Constructor for an Item object by only defining its name and price.
     * Quantity is preset to 1.
     * 
     * @param n a String for the name of the item
     * @param p a double for the price of the item
     */
    public Item(String n, double p) {
        name = n;
        price = p;
        quantity = 1;
    }
    
    /**
     * Getter for the item's name.
     * 
     * @return The item's name as a String.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter for the item's price.
     * 
     * @return The item's price as a double.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Getter for the item's quantity.
     * 
     * @return The item's quantity as an integer.
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Describes the item and its properties.
     * 
     * @return A description of the item's name and properties as a String.
     */
    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nQuantity: "
                + quantity;
    }
    
}