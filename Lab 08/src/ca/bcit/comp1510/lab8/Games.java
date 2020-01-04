/**
 * 
 */
package ca.bcit.comp1510.lab8;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>
 * Games.
 * 
 * Demonstrates the use of loops, switches, and conditionals through simple
 * games.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Games {
    /**
     * The player's score.
     */
    private int playerScore;
    /**
     * Scanner object.
     */
    private Scanner scan;
    /**
     * Random generator.
     */
    private Random generator;
    
    /**
     * Creates the player's score along with a scanner object and random
     * generator object.
     */
    public Games() {
        playerScore = 0;
        scan = new Scanner(System.in);
        generator = new Random();
    }
    
    /**
     * Sets up the menu screen.
     */
    public void play() {
        int playerChoice;
        final int firstChoice = 1;
        final int secondChoice = 2;
        final int thirdChoice = 3;
        final int fourthChoice = 4;
        
        do {
            System.out.println("Welcome to the Games Program!");
            System.out.println("Make your choice (enter a number):");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            playerChoice = scan.nextInt();
            
            // Decides on choices
            if (playerChoice == firstChoice) {
                System.out.println("Your score is " + playerScore);
            } else if (playerChoice == secondChoice) {
                guessANumber();
            } else if (playerChoice == thirdChoice) {
                rockPaperScissors();
            } else if (playerChoice != fourthChoice) {
                System.out.println("That's not a valid choice!");
            }
        } while (playerChoice != fourthChoice);
        
    }
    
    /**
     * Sets up the "Guess a Number" game.
     */
    public void guessANumber() {
        final int generatorNumber = 101;
        final int five = 5;
        int playerTries = 0;
        
        int systemNumber = generator.nextInt(generatorNumber);
        
        int playerNumber;
        
        System.out.println("I've picked a random number between 0 and 100");
        System.out.println("Can you guess it?");
        
        do {
            System.out.println("Guess the number!");
            playerNumber = scan.nextInt();
            if (playerNumber < systemNumber) {
                System.out.println("Too low, guess again!");
                playerTries++;
            } else if (playerNumber > systemNumber) {
                System.out.println("Too high, guess again!");
                playerTries++;
            } else {
                playerTries++;
            }
        } while (playerNumber != systemNumber);
        
        System.out.println("RIGHT!");
        
        if (playerTries <= five) {
            System.out.println("Five points!");
            playerScore += five;
        } else {
            System.out.println("More than 5 tries, no points awarded.");
        }
        
    }
    
    /**
     * Sets up the "Rock, Paper, Scissors" game.
     */
    public void rockPaperScissors() {
        final int rpsChoices = 3;
        int systemNumberRPS = generator.nextInt(rpsChoices);
        String systemStringRPS = null;
        String playerRPS;
        boolean validInput;
        final int addScore = 5;
        final int loseScore = 3;
        
        switch (systemNumberRPS) {
        case 0:
            systemStringRPS = "ROCK";
            break;
        case 1:
            systemStringRPS = "PAPER";
            break;
        case 2:
            systemStringRPS = "SCISSORS";
            break;
        default:
        }
        
        do {
            System.out.println("I've picked one of ROCK, PAPER, and SCISSORS.");
            System.out.println("Which one do you choose?");
            playerRPS = scan.next();
            playerRPS = playerRPS.toUpperCase();
            if (playerRPS.equals("ROCK") || playerRPS.equals("PAPER")
                    || playerRPS.equals("SCISSORS")) {
                validInput = true;
            } else {
                validInput = false;
                System.out.println("That's not a valid choice! Try again!");
            }
        } while (!validInput);
        
        if (systemNumberRPS == 0 && playerRPS.equals("PAPER")) {
            System.out.println("Yes! Paper wraps rock");
            playerScore += addScore;
        } else if (systemNumberRPS == 1 && playerRPS.equals("SCISSORS")) {
            System.out.println("Yes! Scissors cuts paper");
            playerScore += addScore;
        } else if (systemNumberRPS == 2 && playerRPS.equals("ROCK")) {
            System.out.println("Yes! Rock smashes scissors");
            playerScore += addScore;
        } else if ((systemNumberRPS == 0 && playerRPS.equals("SCISSORS"))
                || (systemNumberRPS == 1 && playerRPS.equals("ROCK"))
                || (systemNumberRPS == 2 && playerRPS.equals("PAPER"))) {
            System.out.println("Nope. I picked" + systemStringRPS);
            playerScore -= loseScore;
        } else {
            System.out.println("Tied. I picked " + systemStringRPS + ", too");
        }
    }
    
}