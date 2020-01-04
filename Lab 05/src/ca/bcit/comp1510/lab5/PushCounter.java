package ca.bcit.comp1510.lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * PushCounter.
 * 
 * Demonstrates the use of javaFX by creating counters for yes and no buttons.
 * Also has a text field for which the counters will be set to.
 *
 * @author Benedict Halim
 * @version 2.0
 */
public class PushCounter extends Application {
    
    /**
     * Stores number of times "Yes" button pressed.
     */
    private int yCount;
    /**
     * Stores number of times "No" button pressed.
     */
    private int nCount;
    /**
     * Displays number of times "Yes" button pressed.
     */
    private Text yCountDisplay;
    /**
     * Displays number of times "No" button pressed.
     */
    private Text nCountDisplay;
    
    /**
     * Stores a string representing the count number you've entered.
     */
    private TextField setCounter;
    
    /**
     * Presents a GUI containing a yes, no, yes count decrement, no count
     * decrement buttons and texts that displays how many times the 'Yes' and
     * 'No' buttons are pushed (minus the amount of times the decrement buttons
     * are pushed). Also has a text field which the user can use to set the
     * counters.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        yCount = 0;
        yCountDisplay = new Text("Yes: 0");
        Button yPush = new Button("Yes");
        
        // Increment
        yPush.setOnAction(this::processYesButtonPress);
        // Decrement
        Button yDecrement = new Button("Decrement 'Yes' Count");
        yDecrement.setOnAction(this::processYesDecrementButtonPress);
        
        nCount = 0;
        nCountDisplay = new Text("No: 0");
        // Increment
        Button pushN = new Button("No");
        pushN.setOnAction(this::processNoButtonPress);
        // Decrement
        Button decrementN = new Button("Decrement 'No' Count");
        decrementN.setOnAction(this::processNoDecrementButtonPress);
        
        setCounter = new TextField();
        setCounter.setOnAction(this::processSetButtonCounters);
        
        Label setCounterLabel = new Label("Set the counters to:");
        
        // Display
        FlowPane pane = new FlowPane(yPush, yDecrement, yCountDisplay, pushN,
                decrementN, nCountDisplay, setCounterLabel, setCounter);
        pane.setAlignment(Pos.CENTER);
        
        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: cyan");
        
        final int appWidth = 250;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);
        
        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * Updates the counter and text when the 'Yes' button is pushed.
     * 
     * @param event invokes this method
     */
    public void processYesButtonPress(ActionEvent event) {
        yCount++;
        yCountDisplay.setText("Yes: " + yCount);
    }
    
    /**
     * Updates the counter and text when the 'Decrement 'Yes' Count' button is
     * pushed.
     * 
     * @param event invokes this method
     */
    public void processYesDecrementButtonPress(ActionEvent event) {
        yCount--;
        yCountDisplay.setText("Yes: " + yCount);
    }
    
    /**
     * Updates the counter and text when the 'No' button is pushed.
     * 
     * @param event invokes this method
     */
    public void processNoButtonPress(ActionEvent event) {
        nCount++;
        nCountDisplay.setText("No: " + nCount);
    }
    
    /**
     * Updates the counter and text when 'Decrement 'No' Count' button is
     * pushed.
     * 
     * @param event invokes this method
     */
    public void processNoDecrementButtonPress(ActionEvent event) {
        nCount--;
        nCountDisplay.setText("No: " + nCount);
    }
    
    /**
     * Displays the user inputed count numbers for the yes and no buttons.
     * 
     * @param event invokes this method
     */
    public void processSetButtonCounters(ActionEvent event) {
        yCount = Integer.parseInt(setCounter.getText());
        nCount = Integer.parseInt(setCounter.getText());
        setCounter.setText(null);
        nCountDisplay.setText("No: " + nCount);
        yCountDisplay.setText("Yes: " + yCount);
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
