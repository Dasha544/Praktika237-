package ru.oreshnikova.oreshnikova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button calculateButton;

    @FXML
    private Label daysLabel;

    @FXML
    private TextField monthinput;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        int moth=Integer.parseInt(monthinput.getText().toString());
        if (moth<1||moth>12) {
            daysLabel.setText("Номер месяца должен быть в диапозоне от 1 до 12");
        }
        int days;
        switch (moth){
            case 2:days=28;
            case 4:
            case 6:
            case 9:
            case 11:days=30;
            default:days=31;
        }
        daysLabel.setText("Количество дней:"+days);



    }

}


