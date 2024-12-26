package ru.oreshnikova.oreshnikova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private Button BtnSumm;

    @FXML
    private Label LabelField;

    @FXML
    void sumBtnOnAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText());
        double b = a * (Math.PI / 180);
        LabelField.setText(String.format("a в радиананх=%.2f",b));

    }

}
