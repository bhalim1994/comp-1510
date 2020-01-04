package q5;

import java.util.Scanner;

/**
 * <p>
 * Encodes a 5 letter string into a MIX computer number and decodes the
 * corresponding MIX computer number back into the 5 letter string.
 * </p>
 *
 * @author Benedict Halim, Set1B
 * @version 1.0
 */
public class Pack {
    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Constants for calculating & encoding.
        final int bias = 1;
        final int base56 = 56;
        
        // Character indexes.
        final int zero = 0;
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        
        // Prompts, scans, and stores input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 5 letter string "
                + "(with the letters being from A to I, inclusive): ");
        String input = scan.next();
        
        // Breaks up input into characters.
        char char1 = input.charAt(zero);
        char char2 = input.charAt(one);
        char char3 = input.charAt(two);
        char char4 = input.charAt(three);
        char char5 = input.charAt(four);
        System.out.println(
                "Original string: " + char1 + char2 + char3 + char4 + char5);
        
        // Conversion of characters to MIX computer numbers.
        int num1 = char1 - 'A' + bias;
        int num2 = char2 - 'A' + bias;
        int num3 = char3 - 'A' + bias;
        int num4 = char4 - 'A' + bias;
        int num5 = char5 - 'A' + bias;
        
        // Calculate the encoded number.
        int encodedNumber = num1 * base56 * base56 * base56 * base56
                + num2 * base56 * base56 * base56 + num3 * base56 * base56
                + num4 * base56 + num5;
        System.out.println("Encoded number: " + encodedNumber);
        
        // Calculate the decoded numbers.
        int decodedNum1 = encodedNumber / (base56 * base56 * base56 * base56);
        encodedNumber %= (base56 * base56 * base56 * base56);
        int decodedNum2 = encodedNumber / (base56 * base56 * base56);
        encodedNumber %= (base56 * base56 * base56);
        int decodedNum3 = encodedNumber / (base56 * base56);
        encodedNumber %= (base56 * base56);
        int decodedNum4 = encodedNumber / base56;
        encodedNumber %= base56;
        int decodedNum5 = encodedNumber;
        
        // Convert decoded numbers back to characters.
        char decodedChar1 = (char) (decodedNum1 - bias + 'A');
        char decodedChar2 = (char) (decodedNum2 - bias + 'A');
        char decodedChar3 = (char) (decodedNum3 - bias + 'A');
        char decodedChar4 = (char) (decodedNum4 - bias + 'A');
        char decodedChar5 = (char) (decodedNum5 - bias + 'A');
        
        // Print out decoded characters.
        System.out.println("Decoded characters: " + decodedChar1 + decodedChar2
                + decodedChar3 + decodedChar4 + decodedChar5);
        
        // Close scanner object.
        scan.close();
    }
    
};
