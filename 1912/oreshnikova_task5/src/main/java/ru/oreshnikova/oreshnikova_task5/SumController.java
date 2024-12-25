package ru.oreshnikova.oreshnikova_task5;

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
    private TextField yT;

    @FXML
    void compButtonOnAction(ActionEvent event) {
        try {
            double x = Double.parseDouble(xT.getText());
            double y = Double.parseDouble(yT.getText());

            String result = checkPoint(x, y);
            resultLabel.setText(result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Введите корректные координаты!");
        }
    }

    private String checkPoint(double x, double y) {

        double boundaryY = -Math.abs(x) + 1;

        if (y > boundaryY || x < -1 || x > 1 || y < -100) {
            return "Нет";
        } else if (y == boundaryY || (x == -1 && y >= -100 && y <= 0) || (x == 1 && y >= -100 && y <= 0) || (y == -100 && x >= -1 && x <= 1)) {
            return "На границе";
        } else {
            return "Да";
        }
    }
}
