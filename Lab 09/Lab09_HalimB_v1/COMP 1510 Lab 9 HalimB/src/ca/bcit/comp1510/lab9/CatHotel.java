/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 * CatHotel.
 * 
 * Creates a CatHotel object.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class CatHotel {
    
    /**
     * The list of cats.
     */
    private ArrayList<Cat> guests;
    
    /**
     * The name of the hotel.
     */
    private String hotelName;
    
    /**
     * Constructor for CatHotel object, defining its name.
     * 
     * @param hn a The hotel's name.
     */
    public CatHotel(String hn) {
        hotelName = hn;
        guests = new ArrayList<Cat>();
    }
    
    /**
     * <p>
     * Adds a Cat object into the CatHotel list.
     * <p>
     * 
     * @param newCat The new cat to be added to the list.
     */
    public void addCat(Cat newCat) {
        guests.add(newCat);
    }
    
    /**
     * <p>
     * Removes all the cats on the list.
     * <p>
     */
    public void removeAllGuests() {
        guests.clear();
    }
    
    /**
     * <p>
     * Counts how many cats on the guest list.
     * <p>
     * 
     * @return The number of cats on the guest list.
     */
    public int guestCount() {
        return guests.size();
    }
    
    /**
     * <p>
     * Removes the cats older than the age limit from the guest list.
     * <p>
     * 
     * @param ageLimit The age limit for the cats.
     * @return The number of cats that were evicted from the cat hotel.
     */
    public int removeOldGuests(int ageLimit) {
        int count = 0;
        Iterator<Cat> catIterator = guests.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > ageLimit) {
                count++;
                catIterator.remove();
            }
        }
        
        return count;
    }
    
    /**
     * <p>
     * Prints the cat hotel's name along with the cats on the list.
     * <p>
     */
    public void printGuestList() {
        System.out.println(hotelName);
        for (Cat guest : guests) {
            System.out.println(guest.toString());
        }
    }
    
}