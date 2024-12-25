package ru.oreshnikova.oreshnikova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField Bt;

    @FXML
    private TextField aT;

    @FXML
    private Button compareButton;

    @FXML
    private Label resultLabel;

    @FXML
    void compButtonOnAction(ActionEvent event) {
        try {

            int a = Integer.parseInt(aT.getText());
            int b = Integer.parseInt(Bt.getText());


            if (a != b) {
                int max = Math.max(a, b);
                a = max;
                b = max;
            } else {
                a = 0;
                b = 0;
            }


            resultLabel.setText("Новые значения: A = " + a + ", B = " + b);
        } catch (NumberFormatException e) {

            resultLabel.setText("Ошибка: Введите корректные целые числа!");
        }
    }
}
