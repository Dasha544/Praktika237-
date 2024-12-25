package ru.oreshnikova.oreshnikova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Buttonresult;

    @FXML
    private Label numberLabel;

    @FXML
    private TextField numberTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonresultOnAction(ActionEvent event) {
        String input = numberTextField.getText();

        try {

            int number = Integer.parseInt(input);


            if (number < 100 || number > 999) {
                numberLabel.setText("Ошибка: Введите корректное трехзначное число!");
                return;
            }


            int digit1 = number / 100;
            int digit2 = (number / 10) % 10;
            int digit3 = number % 10;


            int sum = digit1 + digit2 + digit3;
            int product = digit1 * digit2 * digit3;

            numberLabel.setText("Сумма: " + sum + ", Произведение: " + product);

        } catch (NumberFormatException e) {
            numberLabel.setText("Ошибка: Введите корректное число!");
        }
    }
}
