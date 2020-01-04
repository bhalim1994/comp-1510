module lab5module {
    exports ca.bcit.comp1510.lab5;
    
    requires javafx.base;
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    
    opens ca.bcit.comp1510.lab5 to javafx.fxml;
}