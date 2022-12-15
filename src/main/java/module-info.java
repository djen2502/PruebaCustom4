module com.example.pruebacustom4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebacustom4 to javafx.fxml;
    exports com.example.pruebacustom4;
}