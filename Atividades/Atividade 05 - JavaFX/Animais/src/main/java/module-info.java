module com.example.animais {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animais to javafx.fxml;
    exports com.example.animais;
}