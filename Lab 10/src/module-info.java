module lab10module {
    exports ca.bcit.comp1510.lab10;
    
    requires javafx.base;
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    
    opens ca.bcit.comp1510.lab10 to javafx.fxml;
}