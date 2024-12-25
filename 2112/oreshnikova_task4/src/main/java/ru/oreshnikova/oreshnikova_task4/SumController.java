package ru.oreshnikova.oreshnikova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aT;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField numberTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {

        try {
            double A = Double.parseDouble(aT.getText());
            int N = Integer.parseInt(numberTextField.getText());

            if (N > 0) {

                double sum = 1.0;


                double currentTerm = 1.0;


                for (int i = 1; i <= N; i++) {
                    currentTerm *= A;
                    sum += currentTerm;
                }


                resultLabel.setText("Результат: " + sum);
            } else {
                resultLabel.setText("Число N должно быть больше 0.");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Введите корректные значения.");
        }
    }
}
