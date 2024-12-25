module ru.oreshnikova.oreshnikova_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_task6 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_task6;
}