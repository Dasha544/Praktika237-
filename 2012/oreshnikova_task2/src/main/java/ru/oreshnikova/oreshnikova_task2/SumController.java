package ru.oreshnikova.oreshnikova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class SumController {

    @FXML
    private TextField agetxt;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resulttxt;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        int age = Integer.parseInt(agetxt.getText());
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст (от 20 до 69): ");

        if (age < 20 || age > 69) {
            System.out.println("Введите корректный возраст от 20 до 69");
        } else {
            String description;
            int units = age % 10;
            int tens = age / 10;

            switch (tens) {
                case 2:
                    description = "двадцать";
                    resulttxt.setText(""+description);
                    break;
                case 3:
                    description = "тридцать";
                    resulttxt.setText(""+description);
                    break;
                case 4:
                    description = "сорок";
                    resulttxt.setText(""+description);
                    break;
                case 5:
                    description = "пятьдесят";
                    resulttxt.setText(""+description);
                    break;
                case 6:
                    description = "шестьдесят";
                    resulttxt.setText(""+description);
                    break;
                default:
                    description = "";
                    resulttxt.setText(""+description);
                    break;
            }

            switch (units) {
                case 1:
                    description += " один год";
                    resulttxt.setText(""+description);
                    break;
                case 2:
                    description += " два года";
                    resulttxt.setText(""+description);
                    break;
                case 3:
                    description += " три года";
                    resulttxt.setText(""+description);
                    break;
                case 4:
                    description += " четыре года";
                    resulttxt.setText(""+description);
                    break;
                case 5:
                    description += " пять лет";
                    resulttxt.setText(""+description);
                    break;
                case 6:
                    description += " шесть лет";
                    resulttxt.setText(""+description);
                    break;
                case 7:
                    description += " семь лет";
                    resulttxt.setText(""+description);
                    break;
                case 8:
                    description += " восемь лет";
                    resulttxt.setText(""+description);
                    break;
                case 9:
                    description += " девять лет";
                    resulttxt.setText(""+description);
                    break;
                default:
                    description += " лет";
                    resulttxt.setText(""+description);
                    break;
            }

            System.out.println(age + " - \"" + description + "\"");
        }
    }
}





