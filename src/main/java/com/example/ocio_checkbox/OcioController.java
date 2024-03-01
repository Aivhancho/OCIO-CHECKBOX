package com.example.ocio_checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;

public class OcioController {

    @FXML
    private CheckBox cine;

    @FXML
    private CheckBox musica;

    @FXML
    private CheckBox videojuegos;

    @FXML
    private Label welcomeText;
    String informacion;
    @FXML
    void onEnviar(ActionEvent event) {
        if(cine.isSelected()){
            informacion="Cine ha sido seleccionado \n";
        }
        if (musica.isSelected()){
            informacion+="Música ha sido seleccionado \n";
        }
        if (videojuegos.isSelected()){
            informacion+="Videojuegos ha sido seleccionado";
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("Mensaje");
        alert.showAndWait();
    }

}

