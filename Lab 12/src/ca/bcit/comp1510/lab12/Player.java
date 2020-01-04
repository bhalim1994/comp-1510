/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Player.
 * 
 * Constructs a Player object with their name, team name, and number. Implements
 * Comparable interface.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Player implements Comparable<Player> {
    /**
     * Name of player.
     */
    private final String playerName;
    /**
     * Name of team.
     */
    private final String teamName;
    /**
     * Number of player.
     */
    private final int playerNumber;
    
    /**
     * Constructor of a Player object with its corresponding player name, team
     * name, and player number. Name and team name cannot be null or white
     * space. Player number cannot be less than 1.
     * 
     * @param pName   a String for the player's name
     * @param tName   a String for the team's name
     * @param pNumber an integer for the player's number
     */
    public Player(String pName, String tName, int pNumber) {
        if (pName == null || pName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "The player's name cannot be empty or null.");
        } else if (tName == null || tName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "The team's name cannot be empty or null.");
        } else if (pNumber < 1) {
            throw new IllegalArgumentException(
                    "The player's number cannot be less than 1.");
        } else {
            playerName = pName;
            teamName = tName;
            playerNumber = pNumber;
        }
    }
    
    /**
     * Getter for the player's name.
     * 
     * @return the player's name as a String
     */
    public String getPlayerName() {
        return playerName;
    }
    
    /**
     * Getter for the team's name.
     * 
     * @return the team's name as a String
     */
    public String getTeamName() {
        return teamName;
    }
    
    /**
     * Getter for the player's number.
     * 
     * @return the player's number as an integer
     */
    public int getPlayerNumber() {
        return playerNumber;
    }
    
    /**
     * Compares two players according to their corresponding numbers.
     * 
     * @param other a Player object as another player
     * @return 0 if their numbers are equal, -1 if the player's number is less
     *         than the other player's number, 1 if the player's number is
     *         greater than the other player's number.
     */
    public int compareTo(Player other) {
        if (this.getPlayerNumber() == other.getPlayerNumber()) {
            return 0;
        } else if (this.getPlayerNumber() < other.getPlayerNumber()) {
            return -1;
        } else {
            return 1;
        }
    }
    
    /**
     * Checks if this Player object is equal with the other Player object.
     * 
     * @param other another Object.
     * @return True if they are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        return (other instanceof Player
                && playerName.equals(((Player) other).getPlayerName())
                && teamName.equals(((Player) other).getTeamName())
                && playerNumber == (((Player) other).getPlayerNumber()));
    }
    
    /**
     * A description of this player.
     * 
     * @return The player's description as a String.
     */
    
    public String toString() {
        return "Player " + playerName + " #" + playerNumber + " on " + teamName;
    }
}
