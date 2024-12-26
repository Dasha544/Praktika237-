package ru.oreshnikova.oreshnikova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Button BtnSumm;

    @FXML
    private TextField CTextField;

    @FXML
    private Label LabelField;

    @FXML
    void sumBtnOnAction(ActionEvent event) {
        int A = Integer.parseInt(ATextField.getText());
        int B = Integer.parseInt(BTextField.getText());
        int C = Integer.parseInt(CTextField.getText());
int a = A;
A=B;
B=C;
C=a;
LabelField.setText("A= "+A +"B= " +B+"C="+C );
    }

}
