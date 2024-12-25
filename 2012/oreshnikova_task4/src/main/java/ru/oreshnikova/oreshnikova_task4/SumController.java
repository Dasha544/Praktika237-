package ru.oreshnikova.oreshnikova_task4;

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
        boolean isPowerOfThree = isPowerOfThree(number);
        resultLabel.setText(String.valueOf(isPowerOfThree));
    }

    private boolean isPowerOfThree(int n) {
        while (n % 3 == 0 && n > 1) {
            n /= 3;
        }
        return n == 1;
    }
}




