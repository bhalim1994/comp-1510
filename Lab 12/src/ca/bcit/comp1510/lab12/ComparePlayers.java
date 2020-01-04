/**
 * 
 */
package ca.bcit.comp1510.lab12;

import java.util.Scanner;

/**
 * <p>
 * ComparePlayers.
 * 
 * Driver for the Player class.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class ComparePlayers {
    
    /**
     * Constructs multiple Player objects and compares them.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        Player player;
        final int four = 4;
        final int[] playerNumbers = { 10, 50, 0, -5 };
        
        System.out.println("Testing premade players...");
        for (int i = 0; i < four; i++) {
            try {
                if (i == 0) {
                    player = new Player(null, "UBC", playerNumbers[i]);
                } else if (i == 1) {
                    player = new Player("Ben Halim", "  ", playerNumbers[i]);
                } else if (i == 2) {
                    player = new Player("Ben Halim", "UBC", playerNumbers[i]);
                } else {
                    player = new Player("Ben Halim", "UBC", playerNumbers[i]);
                }
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            
        }
        player = new Player("Ben Halim", "UBC", 1);
        player.getPlayerNumber();
        
        Scanner scan = new Scanner(System.in);
        Player[] playerList = new Player[2];
        String index;
        
        for (int i = 0; i < 2; i++) {
            scan = new Scanner(System.in);
            if (i == 0) {
                index = "FIRST";
            } else {
                index = "SECOND";
            }
            
            System.out.println("\nEnter the " + index + " player's name:");
            String playerName = scan.nextLine();
            System.out.println("Enter the " + index + " team's name:");
            String teamName = scan.nextLine();
            System.out.println("Enter the " + index + " player's number:");
            int playerNumber = scan.nextInt();
            
            playerList[i] = new Player(playerName, teamName, playerNumber);
        }
        
        System.out.println("\nComparing the player's numbers...");
        if (playerList[0].compareTo(playerList[1]) == 0) {
            System.out.println("Their numbers are equal.");
        } else if (playerList[0].compareTo(playerList[1]) == -1) {
            System.out.println("The first player's number is less"
                    + " than the second player's number.");
        } else if (playerList[0].compareTo(playerList[1]) == 1) {
            System.out.println("The first player's number is more than"
                    + " the second player's number.");
        }
        
        System.out.println("\nTesting if the players are equal...");
        System.out.println("It is " + playerList[0].equals(playerList[1])
                + " that the players are equal.");
        
        scan.close();
        
    }
    
}