package q5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <p>
 * Email.
 * 
 * Creates an email form.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class Email extends Application {
    
    /**
     * Launches the email form.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        final int width = 600;
        final int height = 400;
        Scene scene = new Scene(new EmailPane(), width, height);
        
        primaryStage.setTitle("Email form");
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
