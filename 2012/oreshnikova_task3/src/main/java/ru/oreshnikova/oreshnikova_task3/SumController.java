package ru.oreshnikova.oreshnikova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NumberTextField;

    @FXML
    private TextField ValueTextField;

    @FXML
    private Label aLabel;

    @FXML
    private Label cLabel;

    @FXML
    private Button calculateButton;

    @FXML
    private Label hLabel;

    @FXML
    private Label sLabel;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        int elementNumber = Integer.parseInt(NumberTextField.getText().toString());
        double elementValue = Double.parseDouble(ValueTextField.getText().toString());

        if (elementNumber < 1 || elementNumber > 4) {
            calculateButton.setText("Номер элемента должен быть от 1 до 4.");
            return;
        }

        double a, c, h, s;
        switch (elementNumber) {
            case 1:
                a = elementValue;
                c = a * Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 2:
                c = elementValue;
                a = c / Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 3:
                h = elementValue;
                c = 2 * h;
                a = c / Math.sqrt(2);
                s = c * h / 2;
                break;
            case 4:
                s = elementValue;
                c = Math.sqrt(4 * s);
                a = c / Math.sqrt(2);
                h = c / 2;
                break;
            default:
                return;
        }

        aLabel.setText("a = " + String.format("%.2f", a));
        cLabel.setText("c = " + String.format("%.2f", c));
        hLabel.setText("h = " + String.format("%.2f", h));
        sLabel.setText("S = " + String.format("%.2f", s));
    }
}

