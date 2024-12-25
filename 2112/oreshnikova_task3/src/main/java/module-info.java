module ru.oreshnikova.oreshnikova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_task3 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_task3;
}