/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Face.
 * 
 * Demonstrates the use of javaFX by drawing a face.
 *
 * @author Benedict Halim
 * @version 2019 v2.0
 */
public class Face extends Application {
    
    /**
     * Draws the face.
     * 
     * @param primaryStage Sets the primary stage.
     */
    public void start(Stage primaryStage) {
        // Set up head constants.
        final int headX = 225;
        final int headY = 250;
        final int headRadiusX = 115;
        final int headRadiusY = 140;
        final int headColorRed = 230;
        final int headColorGreen = 210;
        final int headColorBlue = 130;
        // Draws the head.
        Ellipse head = new Ellipse(headX, headY, headRadiusX, headRadiusY);
        head.setFill(Color.rgb(headColorRed, headColorGreen, headColorBlue));
        
        // Set up eye constants.
        final int leftEyeX = 220;
        final int rightEyeX = 290;
        final int eyeY = 220;
        final int eyeRadius = 7;
        // Draws the eyes.
        Circle leftEye = new Circle(leftEyeX, eyeY, eyeRadius);
        Circle rightEye = new Circle(rightEyeX, eyeY, eyeRadius);
        Group eyes = new Group(leftEye, rightEye);
        
        // Set up mouth constants.
        final int mouthX = 220;
        final int mouthY = 320;
        final int mouthWidth = 50;
        final int mouthHeight = 10;
        // Draws the mouth.
        Rectangle mouth = new Rectangle(mouthX, mouthY, mouthWidth,
                mouthHeight);
        
        // Set up nose constants.
        final int noseX1 = 240;
        final int noseY1 = 255;
        final int noseX2 = 240;
        final int noseY2 = 290;
        final int noseX3 = 260;
        final int noseY3 = 280;
        final int noseRed = 250;
        final int noseGreen = 190;
        final int noseBlue = 130;
        // Draws the nose.
        Polygon nose = new Polygon(noseX1, noseY1, noseX2, noseY2, noseX3,
                noseY3);
        nose.setFill(Color.rgb(noseRed, noseGreen, noseBlue));
        
        // Set up hat constants.
        final int crownX1 = 175;
        final int crownY1 = 80;
        final int crownX2 = 275;
        final int crownY2 = 80;
        final int crownX3 = 330;
        final int crownY3 = 160;
        final int crownX4 = 120;
        final int crownY4 = 160;
        final int billX = 120;
        final int billY = 160;
        final int billWidth = 280;
        final int billHeight = 15;
        // Draws the hat.
        Polygon crown = new Polygon(crownX1, crownY1, crownX2, crownY2, crownX3,
                crownY3, crownX4, crownY4);
        Rectangle bill = new Rectangle(billX, billY, billWidth, billHeight);
        Group hat = new Group(crown, bill);
        
        // Set up stroke width for glasses.
        final int strokeWidth = 3;
        // Set up glasses bridge constants.
        final int bridgeStartX = 245;
        final int bridgeStartY = 220;
        final int bridgeEndX = 265;
        final int bridgeEndY = 220;
        // Draws the bridge of the glasses.
        Line bridge = new Line(bridgeStartX, bridgeStartY, bridgeEndX,
                bridgeEndY);
        bridge.setFill(null);
        bridge.setStroke(Color.BLACK);
        bridge.setStrokeWidth(strokeWidth);
        
        // Set up glasses left temple constants.
        final int leftTempleStartX = 115;
        final int leftTempleStartY = 217;
        final int leftTempleEndX = 195;
        final int leftTempleEndY = 220;
        // Draws the left temple of the glasses.
        Line leftTemple = new Line(leftTempleStartX, leftTempleStartY,
                leftTempleEndX, leftTempleEndY);
        leftTemple.setFill(null);
        leftTemple.setStroke(Color.BLACK);
        leftTemple.setStrokeWidth(strokeWidth);
        
        // Set up glasses right temple constants.
        final int rightTempleStartX = 315;
        final int rightTempleStartY = 220;
        final int rightTempleEndX = 335;
        final int rightTempleEndY = 215;
        // Draws the right temple of the glasses.
        Line rightTemple = new Line(rightTempleStartX, rightTempleStartY,
                rightTempleEndX, rightTempleEndY);
        rightTemple.setFill(null);
        rightTemple.setStroke(Color.BLACK);
        rightTemple.setStrokeWidth(strokeWidth);
        
        // Set up lenses constants for the glasses.
        final int leftLensX = 195;
        final int rightLensX = 265;
        final int lensY = 205;
        final int lensWidth = 50;
        final int lensHeight = 30;
        // Draws the lenses of the glasses.
        Rectangle leftLens = new Rectangle(leftLensX, lensY, lensWidth,
                lensHeight);
        leftLens.setFill(null);
        leftLens.setStroke(Color.BLACK);
        leftLens.setStrokeWidth(strokeWidth);
        Rectangle rightLens = new Rectangle(rightLensX, lensY, lensWidth,
                lensHeight);
        rightLens.setFill(null);
        rightLens.setStroke(Color.BLACK);
        rightLens.setStrokeWidth(strokeWidth);
        Group glasses = new Group(leftLens, rightLens, bridge, leftTemple,
                rightTemple);
        
        // Sets up scene constants.
        final int sceneX = 500;
        final int sceneY = 500;
        
        // Combines all the elements of the face and displays it.
        Group face = new Group(head, eyes, mouth, nose, glasses, hat);
        Scene scene = new Scene(face, sceneX, sceneY, Color.LIGHTBLUE);
        primaryStage.setTitle("Self-Portrait");
        primaryStage.setScene(scene);
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
