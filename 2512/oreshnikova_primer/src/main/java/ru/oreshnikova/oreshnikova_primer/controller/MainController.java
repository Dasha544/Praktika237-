package ru.oreshnikova.oreshnikova_primer.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.oreshnikova.oreshnikova_primer.util.Manager.showSecondScene;

public class MainController implements Initializable {

    @FXML
    private Button go;

    @FXML
    void gobtn(ActionEvent event) {
        showSecondScene("sec.fxml","Marathon Skills 2016");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        go.setStyle("-fx-background-color:#2082AA;");
    }
}
