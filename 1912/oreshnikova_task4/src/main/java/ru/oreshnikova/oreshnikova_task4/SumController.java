package ru.oreshnikova.oreshnikova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button compareButton;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField xT;

    @FXML
    void compButtonOnAction(ActionEvent event) {
        try {
            double x = Double.parseDouble(xT.getText());
            double y;

            if (x < 0) {
                y = Math.pow(x, 5) - 10 - (1.0 / 4) * Math.sqrt(Math.PI + x);
            } else if (x < 1) {
                y = Math.pow(x * x + 3, 3) - Math.sqrt(0.5 * Math.PI + x);
            } else {
                if (Math.PI + x <= 0) {
                    resultLabel.setText("Ошибка: логарифм не определён!");
                    return;
                }
                y = x * (Math.pow(x, 4) + 3 * x) + Math.log(Math.PI + x);
            }

            resultLabel.setText(String.format("Результат: y = %.2f", y));
        } catch (NumberFormatException e) {
            resultLabel.setText("Ошибка: Введите корректное число!");
        }
    }
}
