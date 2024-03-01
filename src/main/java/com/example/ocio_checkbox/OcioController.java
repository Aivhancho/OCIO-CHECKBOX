package com.example.ocio_checkbox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OcioController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}