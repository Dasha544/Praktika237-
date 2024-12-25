package ru.oreshnikova.oreshnikova_task3;

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

        try {
            int N = Integer.parseInt(numberTextField.getText());

            if (N > 0) {

                double result = 1.0;
                for (int i = 1; i <= N; i++) {
                    result *= (1.0 + i / 10.0);
                }


                resultLabel.setText("Результат: " + result);
            } else {
                resultLabel.setText("Число должно быть больше 0.");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Введите корректное число.");
        }
    }
}
