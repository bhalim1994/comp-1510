/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * <p>
 * PhonePad.
 * 
 * Creates a phone pad.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class PhonePad extends Application {
    /**
     * The result of inputed buttons.
     */
    private String result = "";
    /**
     * Label for the result.
     */
    private Label numberLabel = new Label(result);
    /**
     * List of buttons.
     */
    private ArrayList<Button> buttonList = new ArrayList<Button>();
    
    /**
     * Displays a GUI containing a phone pad and displays the buttons pressed.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        String allButtons = "123456789*0#";
        String buttonNumbers;
        GridPane gridPane = new GridPane();
        
        gridPane.setAlignment(Pos.CENTER);
        VBox boxPane = new VBox(numberLabel, gridPane);
        boxPane.setAlignment(Pos.CENTER);
        
        final int buttonAmount = 12;
        final int buttonAmountEachRow = 3;
        
        for (int i = 0; i < buttonAmount; i++) {
            buttonNumbers = allButtons.substring(i, i + 1);
            buttonList.add(new Button(buttonNumbers));
            gridPane.add(buttonList.get(i), i % buttonAmountEachRow,
                    i / buttonAmountEachRow + 1);
            buttonList.get(i).setOnAction((event) -> {
                result = result + ((Button) event.getSource()).getText();
                numberLabel.setText(result);
            });
        }
        
        final int appWidth = 300;
        final int appHeight = 300;
        Scene scene = new Scene(boxPane, appWidth, appHeight);
        
        primaryStage.setTitle("PhonePad");
        primaryStage.setScene(scene);
        primaryStage.show();
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