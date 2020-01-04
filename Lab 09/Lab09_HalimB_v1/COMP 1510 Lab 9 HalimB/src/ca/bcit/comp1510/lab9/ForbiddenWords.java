/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>
 * ForbiddenWords.
 * 
 * Scans for the forbidden words in a text file.
 * </p>
 * 
 * @author Benedict Halim
 * @version 1.0
 * 
 */
public class ForbiddenWords {
    /**
     * The list of forbidden words.
     */
    private ArrayList<String> wordList;
    /**
     * Scanner for file.
     */
    private Scanner fileScanner;
    
    /**
     * Constructor for ForbiddenWords object, loads the words in the text file
     * into an array.
     * 
     * @throws IOException Throws error if file can't be read.
     * @param fileName The name of the file.
     */
    public ForbiddenWords(String fileName) throws IOException {
        wordList = new ArrayList<String>();
        fileScanner = new Scanner(new File(fileName));
        while (fileScanner.hasNext()) {
            wordList.add(fileScanner.nextLine());
        }
    }
    
    /**
     * <p>
     * Checks if the inputed string contains a forbidden word.
     * <p>
     * 
     * @param input The inputed String to be checked.
     * @return boolean Returns true if input has forbidden word, false
     *         otherwise.
     */
    public boolean containsWord(String input) {
        input = input.toLowerCase();
        boolean hasForbiddenWord = false;
        for (String word : wordList) {
            if (input.contains(word)) {
                hasForbiddenWord = true;
            }
        }
        return hasForbiddenWord;
    }
}