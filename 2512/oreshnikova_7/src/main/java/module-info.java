module ru.oreshnikova.oreshnikova_7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_7 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_7;
    exports ru.oreshnikova.oreshnikova_7.controller;
    opens ru.oreshnikova.oreshnikova_7.controller to javafx.fxml;
}