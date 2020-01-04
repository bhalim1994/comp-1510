package q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>
 * WordCounter.
 * 
 * Prints out how many unique words are in bible.txt along with the top 10 most
 * frequent words and their respective frequencies.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class WordCounter {
    /**
     * <p>
     * The list of words in bible.txt.
     * </p>
     */
    private ArrayList<Word> wordList = new ArrayList<Word>();
    
    /**
     * <p>
     * Converts the words in bible.txt into an ArrayList and keeps track of
     * their respective frequencies.
     * 
     * IMPORTANT NOTE: Takes 2-4 minutes to finish running the program.
     * </p>
     * 
     * @param fileName a String representing the file name
     * @throws IOException Throws exception if file cannot be read
     * @return the number of unique words as an integer
     */
    public int parseBook(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner fileScannner = new Scanner(file);
        
        String currentWord;
        boolean isRepeatedWord;
        Word newWord;
        // IMPORTANT NOTE: Takes 2-4 minutes to finish running the program.
        // Please be patient!
        while (fileScannner.hasNext()) {
            currentWord = fileScannner.next();
            isRepeatedWord = false;
            
            for (Word word : wordList) {
                if (word.getWord().toLowerCase()
                        .equals(currentWord.toLowerCase())) {
                    word.incrementFrequency();
                    isRepeatedWord = true;
                    break;
                }
            }
            
            if (!isRepeatedWord) {
                newWord = new Word(currentWord);
                wordList.add(newWord);
            }
            
        }
        
        fileScannner.close();
        return wordList.size();
    }
    
    /**
     * <p>
     * Prints the top n words in frequency.
     * </p>
     * 
     * @param n an integer representing the number of words to return
     */
    public void printTopWords(int n) {
        if (n <= 0 || n >= wordList.size() + 1) {
            throw new ArrayIndexOutOfBoundsException(
                    "The input for the printTopWords is not between 0 and "
                            + wordList.size() + ".");
        }
        
        wordList.sort(null);
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(wordList.get(i).toString());
        }
    }
    
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args unused
     */
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        
        try {
            System.out.println("Total number of unique words: "
                    + wordCounter.parseBook("." + File.separator + "src"
                            + File.separator + "bible.txt"));
            final int n = 10;
            wordCounter.printTopWords(n);
        } catch (IOException e) {
            System.out.println("No file found.");
        }
        
    }
    
};
