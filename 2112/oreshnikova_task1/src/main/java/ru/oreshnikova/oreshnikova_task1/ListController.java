package ru.oreshnikova.oreshnikova_task1;

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
        int count = 0;
        for (Integer number : dataListView.getItems()) {
            if (number % 4 == 0 && number % 7 != 0) {
                count++;
            }
        }
        answerLabel.setText("Результат: " + count);
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        dataListView.getItems().clear();
        answerLabel.setText("");
        numberTextField.clear();
    }
}
