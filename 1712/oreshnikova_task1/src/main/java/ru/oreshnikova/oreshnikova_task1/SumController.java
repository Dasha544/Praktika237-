package ru.oreshnikova.oreshnikova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Button BtnSumm;

    @FXML
    private Label LabelField;

    @FXML
    void sumBtnOnAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText());
        double b = Double.parseDouble(BTextField.getText());
        double absA = Math.abs(a);
        double absB = Math.abs(b);
        double sum = absA + absB;
        double difference = absA - absB;
        double product = absA * absB;
        double quotient = absA / absB;
        LabelField.setText(String.format("Сумма: %.2f Разность: %.2f Произведение: %.2f Частное: %.2f", sum, difference, product, quotient));

    }

}
