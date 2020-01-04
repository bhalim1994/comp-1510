package q4;

/**
 * <p>
 * Address.
 * 
 * The address of a BCIT student.
 * </p>
 * 
 * @author Benedict Halim
 * @version 1.0
 */
public class Address {
    /**
     * <p>
     * Street address.
     * </p>
     */
    private String streetAddress;
    /**
     * <p>
     * City.
     * </p>
     */
    private String city;
    /**
     * <p>
     * State.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Postal Code.
     * </p>
     */
    private String postalCode;
    
    /**
     * <p>
     * Constructs an address object that contains the specified values.
     * </p>
     *
     * @param street     a String representing the street address
     * @param city       a String representing the city
     * @param state      a String representing the state
     * @param postalCode a String representing the postal code
     */
    public Address(String street, String city, String state,
            String postalCode) {
        streetAddress = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
    
    /**
     * <p>
     * Description of the Address object.
     * </p>
     * 
     * @return The street address, city, state, and postal code as a string
     */
    public String toString() {
        String result;
        
        result = streetAddress + "\n";
        result += city + ", " + state + "  " + postalCode;
        
        return result;
    }
}
