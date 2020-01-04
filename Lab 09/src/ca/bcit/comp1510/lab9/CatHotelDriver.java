/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Random;

/**
 * <p>
 * CatHotelDriver.
 * 
 * Driver for the CatHotel and Cat classes.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class CatHotelDriver {
    
    /**
     * Creates a CatHotel object, adds 5 Cats in it, and tests various methods
     * of the Cat and CatHotel classes.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        CatHotel myCatHotel = new CatHotel("Amazing Cat Hotel");
        
        // Generates a random age.
        Random ageRandomizer = new Random();
        
        // Limit of cat's age for randomizer.
        final int catAgeLimit = 10;
        
        // Number of cats to be made.
        final int catNumber = 5;
        
        // Create 5 cats with random ages.
        for (int i = 1; i <= catNumber; i++) {
            Cat newCat = new Cat(ageRandomizer.nextInt(catAgeLimit));
            myCatHotel.addCat(newCat);
        }
        
        // Prints out original list.
        System.out.println("Original cat guest list...");
        myCatHotel.printGuestList();
        
        // Removing cats which are older than 5 then printing out how many you
        // removed.
        System.out.println("\nRemoving cats...");
        final int ageLimitation = 5;
        System.out.println("Removed "
                + myCatHotel.removeOldGuests(ageLimitation) + " cats.");
        
        // Prints list after removals and checks how many cats are in the hotel
        // now
        myCatHotel.printGuestList();
        System.out.println("\nThe number of cats in the hotel is...");
        System.out.println(myCatHotel.guestCount() + ".");
        
        // Clears all cats.
        System.out.println("\nClearing all cats...");
        myCatHotel.removeAllGuests();
        
        // Prints guest list of cleared list.
        myCatHotel.printGuestList();
        
        // Adds 2 cats and checks guest list.
        System.out.println("\nAdding two new cats...");
        final int benAge = 10;
        final int sakiAge = 7;
        Cat benCat = new Cat("Ben", benAge);
        Cat sakiCat = new Cat("Saki", sakiAge);
        myCatHotel.addCat(benCat);
        myCatHotel.addCat(sakiCat);
        myCatHotel.printGuestList();
        
    }
    
}