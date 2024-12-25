module ru.oreshnikova.oreshnikova_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_task1 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_task1;
}