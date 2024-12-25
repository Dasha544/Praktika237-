package ru.oreshnikova.oreshnikova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label DistanceS;

    @FXML
    private Button calculateButton;

    @FXML
    private Label daysk;

    @FXML
    private TextField pTextField;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        double p = Double.parseDouble(pTextField.getText());
        if (p <= 0 || p >= 50) {
            daysk.setText("P должно быть в диапазоне (0, 50).");
            return;
        }

        int k = 0;
        double s = 0;
        double dailyDistance = 10;
        do {
            k++;
            s += dailyDistance;
            dailyDistance *= (1 + p / 100);
        } while (s <= 200);

        daysk.setText("Количество дней: " + k);
        DistanceS.setText("Суммарный пробег: " + String.format("%.2f", s));
    }

}
