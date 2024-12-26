package ru.oreshnikova.oreshnikova_primer.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.oreshnikova.oreshnikova_primer.util.Manager.showSecondScene;

public class Second {

    @FXML
    private Button goB;

    @FXML
    void goB(ActionEvent event) {
        showSecondScene("hello-view.fxml","Marathon Skills 2016");
    }

}
