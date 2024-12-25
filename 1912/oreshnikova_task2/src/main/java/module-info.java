module ru.oreshnikova.oreshnikova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_task2 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_task2;
}