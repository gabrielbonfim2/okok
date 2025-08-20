module com.example.foi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foi to javafx.fxml;
    exports com.example.foi;
}