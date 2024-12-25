module ru.oreshnikova.oreshnikova_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_task5 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_task5;
}