package ru.oreshnikova.oreshnikova_task4;
import static java.lang.Math.*;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button BtnSumm;

    @FXML
    private Label LabelField;

    @FXML
    private TextField uTextField;

    @FXML
    void sumBtnOnAction(ActionEvent event) {
        double u = Double.parseDouble(uTextField.getText());
        double m = u / 3;
        double x = pow(u, 2);
        double y=(pow(sqrt(pow(m, 4) + m - pow(cos(x + m), 2)), 5)/(m-pow(m,2))+sqrt(m))*m+x;
        LabelField.setText(String.format("y=%.2f",y));


    }

}
