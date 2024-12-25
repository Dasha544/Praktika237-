package ru.oreshnikova.oreshnikova_task5;

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
    private TextField uT;

    @FXML
    private TextField vT;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        try {

            double u = Double.parseDouble(uT.getText());
            double v = Double.parseDouble(vT.getText());
            int n = Integer.parseInt(numberTextField.getText());

            if (n <= 0) {
                resultLabel.setText("Введите натуральное число для n.");
                return;
            }


            double aPrev = u;
            double bPrev = v;

            double sum = 0;

            for (int k = 1; k <= n; k++) {

                double aCurr = 2 * bPrev + aPrev;
                double bCurr = 2 * Math.pow(aPrev, 2) + bPrev;


                long factorial = 1;
                for (int i = 2; i <= (k + 1); i++) {
                    factorial *= i;
                }


                sum += (aCurr * bCurr) / factorial;


                aPrev = aCurr;
                bPrev = bCurr;
            }


            resultLabel.setText(String.format("сумма=%.2f",sum));
        } catch (NumberFormatException e) {
            resultLabel.setText("Введите корректные значения для u, v и n.");
        }
    }
}
