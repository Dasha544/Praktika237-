package ru.oreshnikova.oreshnikova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;


    @FXML
    void addButtonOnAction(ActionEvent event) {
        try {
            int number = Integer.parseInt(numberTextField.getText());
            if (number <= 0 || number > 30000) {
                answerLabel.setText("Введите число от 1 до 30,000");
                return;
            }
            dataListView.getItems().add(number);
            numberTextField.clear();
        } catch (NumberFormatException e) {
            answerLabel.setText("Введите корректное натуральное число!");
        }
    }


    @FXML
    void OkButtonOnAction(ActionEvent event) {
        int minNumber = Integer.MAX_VALUE;
        boolean found = false;

        for (Integer number : dataListView.getItems()) {
            if (number % 10 == 4) {
                minNumber = Math.min(minNumber, number);
                found = true;
            }
        }

        if (found) {
            answerLabel.setText("Минимальное число, оканчивающееся на 4: " + minNumber);
        } else {
            answerLabel.setText("Чисел, оканчивающихся на 4, не найдено.");
        }
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        dataListView.getItems().clear();
        answerLabel.setText("");
        numberTextField.clear();
    }
}
