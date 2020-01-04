/**
 * 
 */
package ca.bcit.comp1510.lab3;

import java.util.Random;

/**
 * CardGame.
 * 
 * Demonstrates the use of various methods in the API for the Random class and
 * the use of enumeration.
 *
 * @author Benedict Halim
 * @version 2019 v2.0
 */
public class CardGame {
    
    /**
     * Rank enumeration.
     */
    enum Rank {
        /**
         * Ace.
         */
        ace,
        /**
         * Two.
         */
        two,
        /**
         * Three.
         */
        three,
        /**
         * Four.
         */
        four,
        /**
         * Five.
         */
        five,
        /**
         * Six.
         */
        six,
        /**
         * Seven.
         */
        seven,
        /**
         * Eight.
         */
        eight,
        /**
         * Nine.
         */
        nine,
        /**
         * Ten.
         */
        ten,
        /**
         * Jack.
         */
        jack,
        /**
         * Queen.
         */
        queen,
        /**
         * King.
         */
        king
    }
    
    /**
     * Suit enumeration.
     */
    enum Suit {
        /**
         * Hearts.
         */
        hearts,
        /**
         * Diamonds.
         */
        diamonds,
        /**
         * Clubs.
         */
        clubs,
        /**
         * Spades.
         */
        spades
    }
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomRankChoice = randomGenerator.nextInt(Rank.values().length);
        int randomSuitChoice = randomGenerator.nextInt(Suit.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        Suit randomSuit = Suit.values()[randomSuitChoice];
        System.out.println(
                "Your card is a " + randomRank + " of " + randomSuit + ".");
    }
    
}
