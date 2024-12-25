package ru.oreshnikova.oreshnikova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button compareButton;

    @FXML
    private TextField numberinput;

    @FXML
    private Label resultLabel;

    @FXML
    void compButtonOnAction(ActionEvent event) {
        String input = numberinput.getText();

        try {

            int number = Integer.parseInt(input);


            if (number < 100 || number > 999) {
                resultLabel.setText("Ошибка: Введите корректное трехзначное число!");
                return;
            }

            // Извлекаем первую и вторую цифры
            int firstDigit = number / 100;
            int secondDigit = (number / 10) % 10;


            if (firstDigit > secondDigit) {
                resultLabel.setText("Первая цифра больше второй.");
            } else if (firstDigit < secondDigit) {
                resultLabel.setText("Вторая цифра больше первой.");
            } else {
                resultLabel.setText("Первая и вторая цифры равны.");
            }

        } catch (NumberFormatException e) {

            resultLabel.setText("Ошибка: Введите корректное число!");
        }
    }
    }


