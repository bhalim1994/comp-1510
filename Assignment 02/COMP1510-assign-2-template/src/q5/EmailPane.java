package q5;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * <p>
 * Constructs an email layout form.
 * </p>
 *
 * @author Benedict Halim
 * @version 1.0
 */
public class EmailPane extends GridPane {
    /**
     * To text field.
     */
    private TextField toField;
    /**
     * cc text field.
     */
    private TextField ccField;
    /**
     * bcc text field.
     */
    private TextField bccField;
    /**
     * Subject text field.
     */
    private TextField subjectField;
    /**
     * Message text area.
     */
    private TextArea messageArea;
    
    /**
     * Constructs the EmailPane object with labels, its corresponding text
     * fields, and a send button.
     */
    public EmailPane() {
        Button sendButton = new Button("Send Email");
        sendButton.setOnAction(this::onButtonPress);
        
        Label toLabel = new Label("To: ");
        Label ccLabel = new Label("Cc: ");
        Label bccLabel = new Label("Bcc: ");
        Label subjectLabel = new Label("Subject: ");
        Label messageLabel = new Label("Message: ");
        
        toField = new TextField();
        ccField = new TextField();
        bccField = new TextField();
        subjectField = new TextField();
        messageArea = new TextArea();
        
        final int arg0 = 0;
        final int arg1 = 1;
        
        addColumn(arg0, toLabel, ccLabel, bccLabel, subjectLabel, messageLabel);
        addColumn(arg1, toField, ccField, bccField, subjectField, messageArea,
                sendButton);
        
    }
    
    /**
     * Prints out the contents of the email.
     * 
     * @param event invoked this method
     */
    public void onButtonPress(ActionEvent event) {
        System.out.println("To: " + toField.getText());
        System.out.println("Cc: " + ccField.getText());
        System.out.println("Bcc: " + bccField.getText());
        System.out.println("Subject: " + subjectField.getText());
        System.out.println("Message: " + messageArea.getText());
        
    }
}
