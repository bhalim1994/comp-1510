module lab8module {
    exports ca.bcit.comp1510.lab8;
    
    requires javafx.base;
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    
    opens ca.bcit.comp1510.lab8 to javafx.fxml;
}