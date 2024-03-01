module com.example.ocio_checkbox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ocio_checkbox to javafx.fxml;
    exports com.example.ocio_checkbox;
}