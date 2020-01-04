/**
 * 
 */
package ca.bcit.comp1510.lab3;

import java.util.Scanner;

/**
 * FunWithStrings.
 * 
 * Demonstrates the use of various methods in the API for the String class.
 *
 * @author Benedict Halim
 * @version 2019 v2.0
 */
public class FunWithStrings {
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        // Q3.
        Scanner myScanner = new Scanner(System.in);
        // Q4.
        String userInput = new String();
        // Q5.
        System.out.print("Please enter the title of your favourite book: ");
        // Q8.
        userInput = myScanner.nextLine();
        
        // Q10. No, it does not work as next() can read the input only until the
        // space. It can't read two words separated by a space. Also, next()
        // places the cursor in the same line after reading the input.
        // nextLine() reads input including space between the words (that is, it
        // reads till the end of line \n). Once the input is read, nextLine()
        // positions the cursor in the next line.
        //
        // For reading the entire line you can use nextLine().
        
        System.out.println(
                "The title of your favourite book is " + userInput + ".");
        
        int stringLength = userInput.length();
        System.out.println("The length of that title is " + stringLength
                + " characters long.");
        
        System.out.println("It is " + userInput.startsWith("The ")
                + " that the title of the book starts with \"The\".");
        // Q14.
        userInput.toUpperCase();
        System.out.println("Question 14: " + userInput);
        // Q14. No, it did not change
        
        // Q15.
        String uppercaseUserInput = new String();
        uppercaseUserInput = userInput.toUpperCase();
        System.out.println("Question 15: " + uppercaseUserInput);
        // Q15. Yes, it worked
        
        // Q16. The "String" object is immutable, therefore the method
        // toUpperCase() doesn't change the object. You'd need to store the
        // change in a variable to obtain an input different from the original
        // user input.
        
        // Q17.
        System.out.println(
                "Title of book in upper case: " + userInput.toUpperCase());
        System.out.println(
                "Title of book in lower case: " + userInput.toLowerCase());
        String lowercaseUserInput = new String();
        lowercaseUserInput = userInput.toLowerCase();
        System.out.println("The title of the book in all lowercase, "
                + "using the lowercaseUserInput variable, " + "is " + "\""
                + lowercaseUserInput + "\".");
        
        // Q18.
        String trimmedUserInput = userInput.trim();
        System.out.println(
                "The trimmed title of the book is " + trimmedUserInput + ".");
        // a & b. If only tabs or spaces are entered, an error is shown as the
        // trimmed string is null and the length is 0.
        // c & d. No error. In c, the total length is the word while in d, the
        // total length are the words including the spaces between the words.
        
        // Q19.
        String firstLetter = userInput.substring(0, 1);
        String lastLetter = userInput.substring((stringLength - 1),
                (stringLength));
        String firstAndLastUppercase = firstLetter.toUpperCase()
                + userInput.substring(1, stringLength - 1)
                + lastLetter.toUpperCase();
        System.out.println(
                "The title with the first and last letter capitalized is: "
                        + firstAndLastUppercase);
        
        myScanner.close();
    }
    
}
