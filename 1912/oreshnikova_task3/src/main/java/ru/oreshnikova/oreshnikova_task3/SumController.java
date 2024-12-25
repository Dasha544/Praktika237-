package ru.oreshnikova.oreshnikova_task3;

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
    private TextField cT;

    @FXML
    private Button compareButton;

    @FXML
    private Label resultLabel;

    @FXML
    void compButtonOnAction(ActionEvent event) {
        try {

            double a = Double.parseDouble(aT.getText());
            double b = Double.parseDouble(Bt.getText());
            double c = Double.parseDouble(cT.getText());


            if (a < b && b < c) {

                a *= 2;
                b *= 2;
                c *= 2;
            } else {

                a = -a;
                b = -b;
                c = -c;
            }


            resultLabel.setText(String.format("Новые значения: A = %.2f, B = %.2f, C = %.2f", a, b, c));
        } catch (NumberFormatException e) {

            resultLabel.setText("Ошибка: Введите корректные числа!");
        }
    }
}
