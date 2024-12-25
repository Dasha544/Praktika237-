module ru.oreshnikova.oreshnikova_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_task4 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_task4;
}