/**
 * 
 */
package ca.bcit.comp1510.lab9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * <p>
 * PasswordValidator.
 * 
 * Checks whether two inputed passwords match and whether it follows the various
 * rules.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */

public class PasswordValidator extends Application {
    
    /**
     * Validation text.
     */
    private Text validationText = new Text();
    
    /**
     * Text field for Enter password.
     */
    private TextField enterPassword = new TextField();
    
    /**
     * Text field for Confirm password.
     */
    private TextField confirmPassword = new TextField();
    
    /**
     * Word list of forbidden words.
     */
    private ForbiddenWords wordList;
    
    /**
     * Presents a GUI which has two password fields to fill out.
     */
    public void start(Stage primaryStage) throws Exception {
        // Initializes ForbiddenWords object
        wordList = new ForbiddenWords("src/ca/bcit/comp1510/lab9/wordlist.txt");
        
        Label enterPasswordLabel = new Label("Enter Password: ");
        Label confirmPasswordLabel = new Label("Confirm Password: ");
        Button submitButton = new Button("Submit");
        
        final int width = 280;
        final int height = 130;
        
        submitButton.setOnAction(this::processButtonPress);
        
        GridPane pane = new GridPane();
        ;
        
        pane.add(enterPasswordLabel, 0, 0);
        pane.add(confirmPasswordLabel, 0, 1);
        pane.add(enterPassword, 1, 0);
        pane.add(confirmPassword, 1, 1);
        pane.add(submitButton, 0, 2);
        pane.add(validationText, 1, 2);
        
        Scene scene = new Scene(pane, width, height);
        
        primaryStage.setTitle("Password Validator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    /**
     * Checks if there's an input or that the password fields are equal.
     * 
     * @param event Invokes this method.
     */
    public void processButtonPress(ActionEvent event) {
        if (enterPassword.getText().equals("")) {
            validationText.setText("INVALID");
        } else if (enterPassword.getText().equals(confirmPassword.getText())
                && oneCapital(enterPassword.getText())
                && oneLowerCase(enterPassword.getText())
                && oneNumber(enterPassword.getText())
                && oneSpecial(enterPassword.getText())
                && stringLength(enterPassword.getText())
                && !wordList.containsWord(enterPassword.getText())) {
            validationText.setText("VALID");
        } else {
            validationText.setText("INVALID");
        }
    }
    
    /**
     * <p>
     * Checks if the password is at least 8 characters long and not more than
     * 10.
     * <p>
     * 
     * @param password The password to check
     * @return boolean True if the password is at least 8 characters long and
     *         not more than 10, otherwise false.
     */
    private boolean stringLength(String password) {
        return (password.length() >= 8 && password.length() <= 10);
    }
    
    /**
     * <p>
     * Checks if the password has at least one capital letter.
     * <p>
     * 
     * @param password The password to check
     * @return boolean True if the password includes at least one capital, false
     *         otherwise.
     */
    private boolean oneCapital(String password) {
        char c;
        boolean hasOneCapital = false;
        for (int i = 0; i <= password.length() - 1; i++) {
            c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasOneCapital = true;
            }
        }
        return hasOneCapital;
    }
    
    /**
     * <p>
     * Checks if the password has a least one lower case letter.
     * <p>
     * 
     * @param password The password to check
     * @return boolean True if the password includes at least one lower case,
     *         false otherwise.
     */
    private boolean oneLowerCase(String password) {
        char c;
        boolean hasOneLowerCase = false;
        for (int i = 0; i <= password.length() - 1; i++) {
            c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasOneLowerCase = true;
            }
        }
        return hasOneLowerCase;
    }
    
    /**
     * <p>
     * Checks if the password has a least one number.
     * <p>
     * 
     * @param password The password to check
     * @return boolean True if the password includes at least one number, false
     *         otherwise.
     */
    private boolean oneNumber(String password) {
        char c;
        boolean hasOneNumber = false;
        for (int i = 0; i <= password.length() - 1; i++) {
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasOneNumber = true;
            }
        }
        return hasOneNumber;
    }
    
    /**
     * <p>
     * Checks if the password has a least one special character.
     * <p>
     * 
     * @param password The password to check
     * @return boolean True if the password contains at least one special
     *         character, false otherwise
     */
    private boolean oneSpecial(String password) {
        String c;
        String specialChar = "!\"#$%&\'()*";
        boolean hasOneSpecialChar = false;
        for (int i = 0; i <= password.length() - 1; i++) {
            c = password.substring(i, i + 1);
            if (specialChar.contains(c)) {
                hasOneSpecialChar = true;
            }
        }
        return hasOneSpecialChar;
    }
    
    /**
     * Launches the JavaFX application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}