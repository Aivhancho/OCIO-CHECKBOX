package com.example.ocio_checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;

import java.net.URL;
import java.util.ResourceBundle;

public class OcioController implements Initializable {

    @FXML
    private CheckBox cine;

    @FXML
    private CheckBox musica;

    @FXML
    private CheckBox videojuegos;

    @FXML
    private Label welcomeText;
    String informacion;
    String[] bebidasDisponibles = {"Agua", "Te", "Vino"};

    @FXML
    private ComboBox bebidacb;
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
        alert.setContentText(informacion);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bebidacb.getItems().addAll(bebidasDisponibles);
    }
}

