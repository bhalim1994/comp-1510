/**
 * 
 */
package q1;

/**
 * <p>
 * Word.
 * 
 * Creates the Word object.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Word implements Comparable<Word> {
    /**
     * <p>
     * The word itself.
     * </p>
     */
    private final String word;
    /**
     * <p>
     * The frequency of the specified word.
     * </p>
     */
    private int frequency;
    
    /**
     * <p>
     * Constructs the Word object that contains the word itself and its
     * corresponding frequency set to 1.
     * </p>
     * 
     * @param w a String representing the word
     */
    public Word(String w) {
        word = w.toLowerCase();
        frequency = 1;
    }
    
    /**
     * <p>
     * Gets the word.
     * </p>
     * 
     * @return the word as a String
     */
    public String getWord() {
        return word.toLowerCase();
    }
    
    /**
     * <p>
     * Gets the frequency of the word.
     * </p>
     * 
     * @return the frequency of the word as an integer
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * <p>
     * Increments the frequency of the word by one.
     * </p>
     */
    public void incrementFrequency() {
        frequency++;
    }
    
    /**
     * <p>
     * Compares the current word with the inputed word.
     * </p>
     * 
     * @param anotherWord a Word object representing another word to compare
     *                    with the current word
     * @return A positive integer if the inputed words frequency is larger,
     *         negative integer if inputed words frequency is smaller, 0 if they
     *         are equal.
     */
    public int compareTo(Word anotherWord) {
        Integer currentWordCount = Integer.valueOf(this.getFrequency());
        Integer anotherWordCount = Integer.valueOf(anotherWord.getFrequency());
        return anotherWordCount.compareTo(currentWordCount);
    }
    
    /**
     * <p>
     * Returns a String description of this word and its associated frequency.
     * </p>
     * 
     * @return the description of this word as a String
     */
    public String toString() {
        return word.toLowerCase() + "\t Word frequency: " + frequency;
    }
}
