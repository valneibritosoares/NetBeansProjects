module com.mycompany.cursofx1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cursofx1 to javafx.fxml;
    exports com.mycompany.cursofx1;
}
