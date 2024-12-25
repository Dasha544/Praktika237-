package ru.oreshnikova.oreshnikova_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button calculateButton;

    @FXML
    private TextField numberTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(numberTextField.getText());
        boolean hasNumber2 = false;
        while (number > 0) {
            if (number % 10 == 2) {
                hasNumber2 = true;
                break;
            }
            number /= 10;
        }

        resultLabel.setText(String.valueOf(hasNumber2));
    }

}


