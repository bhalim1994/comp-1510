/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Transaction.
 * 
 * Represents a transaction which includes an array for items.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Transaction {
    /**
     * Array of items.
     */
    private Item[] cart;
    /**
     * Total price of items.
     */
    private double totalPrice;
    /**
     * Total number of items.
     */
    private int itemCount;
    
    /**
     * Constructor for a Transaction object, defining its items, total price,
     * and number of items.
     * 
     * @param i an integer for number of items.
     */
    public Transaction(int i) {
        cart = new Item[i];
        totalPrice = 0.0;
        itemCount = 0;
    }
    
    /**
     * Adds an item to the cart along with its name, price, and quantity.
     * 
     * @param n a String for the name of the item
     * @param p a String for the price of the item
     * @param q a String for the quantity of the item
     */
    public void addToCart(String n, double p, int q) {
        Item item = new Item(n, p, q);
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        totalPrice = totalPrice + p * q;
        itemCount++;
    }
    
    /**
     * Adds an item to the cart.
     * 
     * @param i an Item object added to the cart
     */
    public void addToCart(Item i) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = i;
        totalPrice = totalPrice + i.getPrice() * i.getQuantity();
        itemCount++;
    }
    
    /**
     * Increase cart size.
     */
    public void increaseSize() {
        final int addItems = 5;
        
        Item[] c = new Item[cart.length + addItems];
        
        for (int i = 0; i < cart.length; i++) {
            c[i] = cart[i];
        }
        cart = c;
    }
    
    /**
     * Getter for the total price.
     * 
     * @return the total price as a double
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Getter for the number of items.
     * 
     * @return the number of items as an integer.
     */
    public int getCount() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += cart[i].getQuantity();
        }
        return total;
    }
    
    /**
     * Describes the transaction.
     * 
     * @return a description of the transaction as a String
     */
    public String toString() {
        String result = "";
        
        for (Item i : cart) {
            if (i != null) {
                if (i.getName().length() < 8) {
                    result += i.getName() + "\t\t\t$" + i.getPrice() + "\t\t"
                            + i.getQuantity() + "\n";
                } else if (i.getName().length() < 16) {
                    result += i.getName() + "\t\t$" + i.getPrice() + "\t\t"
                            + i.getQuantity() + "\n";
                } else {
                    result += i.getName() + "\t$" + i.getPrice() + "\t\t"
                            + i.getQuantity() + "\n";
                }
            }
        }
        result += "Total number of items: " + getCount() + "\n";
        result += "Total price: $" + getTotalPrice();
        
        return result;
    }
    
}