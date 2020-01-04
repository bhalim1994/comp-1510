/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * MyFirstGraphicProgram.
 * 
 * Demonstrates the use of javaFX.
 *
 * @author Benedict Halim
 * @version 2019 v1.0
 */
public class MyFirstGraphicProgram extends Application {
    
    /**
     * Starts javaFX program.
     * 
     * @param primaryStage Sets the primary stage.
     */
    public void start(Stage primaryStage) {
        final int circleX = 250;
        final int radius = 100;
        final int textX = 225;
        final int centerY = 250;
        final int sceneX = 500;
        final int sceneY = 500;
        // 5.
        Circle myCircle = new Circle(circleX, centerY, radius);
        Text name = new Text(textX, centerY, "Ben Halim");
        // 13.
        myCircle.setFill(Color.GREEN);
        // 14.
        name.setFill(Color.WHITE);
        
        // 6 & 14.
        Group group = new Group(myCircle, name);
        // 7.
        Scene scene = new Scene(group, sceneX, sceneY);
        // 8.
        primaryStage.setTitle("My first JavaFX program.");
        // 9.
        primaryStage.setScene(scene);
        // 10.
        primaryStage.show();
    }
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
