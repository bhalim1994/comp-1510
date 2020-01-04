/**
 * 
 */
package ca.bcit.comp1510.lab8;

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
 * Checks whether two inputed passwords match on a GUI.
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
     * Presents a GUI which has two password fields to fill out.
     */
    public void start(Stage primaryStage) throws Exception {
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
        } else if (enterPassword.getText().equals(confirmPassword.getText())) {
            validationText.setText("VALID");
        } else {
            validationText.setText("INVALID");
        }
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